import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        // int[] nums = {1, 15, 6, 3};
        // System.out.println(differenceOfSum(nums));

        // int[][] mat = {
        // {1, 2}, {3, 4}
        // };

        // for 2D arrays => Arrays.deepToString()
        // System.out.println(Arrays.deepToString(matrixReshape(mat, 1, 4)));

        // int[][] matrix = {
        // { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 }
        // };
        // setZeroes2(matrix);

        // int[] num = {1, 2, 3, 4};
        // System.out.println(productExceptSelf(num));

        // String s = "0110111";
        // numSub2(s);

        int[] nums = { 1, 7, 3, 6, 5, 6 };
        pivotIndex(nums);
    }

    // https://leetcode.com/problems/rotate-array/
    // way-1
    public void rotate(int[] nums, int k) {
        int[] ref = new int[nums.length];
        for (int i=0; i<ref.length; i++) {
            ref[i] = nums[i];
        }

        k = k % nums.length;
        int count = nums.length-k;
        for (int i=0; i<k; i++) {
            nums[i] = ref[count++];
        }

        count = 0;
        for (int i=k; i<nums.length; i++) {
            nums[i] = ref[count++];
        }
    }
    
    // way-2
    public void rotate2(int[] nums, int k) {
        
    }
    
    
    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            // We skip to next index if we see a duplicate element
            if (nums[i - 1] != nums[i]) {
                /*
                 * Storing the unique element at insertIndex index and incrementing
                 * the insertIndex by 1
                 */
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }

    public static List<Integer> magic(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {

            int minCol = minIndexInCol(matrix, row);
            int value = matrix[row][minCol];

            if (maxValueInRow(matrix, minCol, value)) {
                result.add(value);
            }
        }

        return result;
    }

    private static int minIndexInCol(int[][] matrix, int row) {
        int minIndex = 0;
        int min = matrix[row][minIndex];

        for (int col = 1; col < matrix[row].length; col++) {
            if (matrix[row][col] < min) {
                min = matrix[row][col];
                minIndex = col;
            }
        }

        return minIndex;
    }

    private static boolean maxValueInRow(int matrix[][], int col, int value) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][col] > value) {
                return false;
            }
        }

        return true;
    }

    public static int differenceOfSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int elementSum = 0;
        int digitSum = 0;

        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];

            while (nums[i] > 0) {
                digitSum += nums[i] % 10;
                // System.out.println(digitSum);
                nums[i] = nums[i] / 10;
            }
        }

        return Math.abs(elementSum - digitSum);
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        // System.out.println(rows);
        int cols = mat[0].length;

        if ((rows * cols) != (r * c))
            return mat;

        int[][] output = new int[r][c];
        int output_rows = 0;
        int output_cols = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                output[output_rows][output_cols] = mat[i][j];
                output_cols++;

                // if the cols value reached then change the row and set the cols value to 0.
                if (output_cols == c) {
                    output_cols = 0;
                    output_rows++;
                }
            }
        }

        return output;
    }

    public static int[][] matrixReshape2(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if (r * c != m * n)
            return nums;

        int[][] reshaped = new int[r][c];
        for (int i = 0; i < r * c; i++)
            // i % c will give us the current column number...
            // i / c will give us how many rows we have completely filled...
            reshaped[i / c][i % c] = nums[i / n][i % n];

        return reshaped;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<Integer>();

        if (matrix.length == 0) {
            return res;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            // 1st prints : 1, 2, 3
            // 5th prints : 5
            for (int j = colBegin; j <= colEnd; j++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            // Traverse Down
            // 2nd prints : 6, 9
            for (int j = rowBegin; j <= rowEnd; j++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                // Traverse Left
                // 3rd prints : 8, 7
                for (int j = colEnd; j >= colBegin; j--) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                // Traver Up
                // 4th prints : 4
                for (int j = rowEnd; j >= rowBegin; j--) {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin++;
        }

        return res;
    }

    // Q-73
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length, k = 0;
        // First row has zero?
        while (k < n && matrix[0][k] != 0)
            ++k;
        // Use first row/column as marker, scan the matrix
        for (int i = 1; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (matrix[i][j] == 0)
                    matrix[0][j] = matrix[i][0] = 0;
        // Set the zeros
        for (int i = 1; i < m; ++i)
            for (int j = n - 1; j >= 0; --j)
                if (matrix[0][j] == 0 || matrix[i][0] == 0)
                    matrix[i][j] = 0;
        // Set the zeros for the first row
        if (k < n)
            Arrays.fill(matrix[0], 0);
    }

    public static void setZeroes2(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((row[i] == 1 || col[j] == 1) && matrix[i][j] != 0) {
                    matrix[i][j] = 0;
                    // System.out.println(count++);
                }
            }
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product *= nums[j];
                    System.out.println(product);
                }
            }
            System.out.println("element : " + product);
            ans[i] = product;
        }

        return ans;
    }

    // for (int i = digits.length - 1; i >= 0; i--) {
    // if (digits[i] < 9) {
    // digits[i]++;
    // return digits;
    // // starting from extreme right--> if array[i] is less than 9 means can be
    // added with 1
    // // i.e. [ 5,8 ]-->[ 5,9 ] or
    // // [ 9,4 ]-->[ 9,5 ] or
    // // [ 6,0 ]-->[ 6,1 ]
    // // and will directly return array
    // }

    // digits[i] = 0;
    // // if array[i] is not less than 9, means it have to be 9 only then digit is
    // changed to 0,
    // // and we again revolve around loop to check for number if less than 9 or not
    // // i.e. [ 5,9 ]-->[ 5,0 ]-loop->[ 6,0 ] or
    // // [ 1,9,9 ]-->[ 1,9,0 ]-loop->[ 1,0,0 ]-loop->[ 2,0,0 ]
    // // and will directly return array
    // }

    // // if all number inside array are 9
    // // i.e. [ 9,9,9,9 ] than according to above loop it will become [ 0,0,0,0 ]
    // // but we have to make it like this [ 9,9,9,9 ]-->[ 1,0,0,0,0 ]

    // // to make like above we need to make new array of length--> n+1
    // // by default new array values are set to -->0 only
    // // thus just changed first value of array to 1 and return the array

    // digits = new int[digits.length + 1];
    // digits[0] = 1;
    // return digits;

    public static int numSub(String s) {
        int ans = 0;
        int currSum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                currSum++;
                System.out.println("currSum is : " + currSum);
            } else if (i == s.length() - 1 || s.charAt(i) != '1') {
                ans += ((currSum + 1) * currSum) / 2;
                currSum = 0;
                System.out.println("ans is: " + ans);
            }
        }

        int mod = (int) 1e9 + 7;
        return ans % mod;
    }

    public static int numSub2(String s) {
        long count = 0;
        int ones = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                ones = 0;
            } else {
                System.out.println("ones are : " + ones);
                count += ++ones;
                System.out.println("count is : " + count);
            }
        }
        return (int) (count % 1_000_000_007);
    }

    // https://leetcode.com/problems/find-pivot-index
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x : nums)
            sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) {
                System.out.println(sum);
                System.out.println(nums);
                System.out.println(leftsum);
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}
