import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class Solution {
	public static void main(String[] args) {
		int[] gain = {-5, 1, 5, 0, -7 };
		// largestAltitude(gain);

        // removeStars("leet**cod*e");

        System.out.println(canReach("011010", 2, 3));

        // 1
        String[] patterns = { "a", "b", "c" };
        String word = "aaaaabbbbb";

        System.out.println(numOfStrings(patterns, word));

        // 2
        String s = "codeleet";
        int[] indices = { 4,5,6,7,0,2,1,3 };

        System.out.println(restoreString(s, indices));

        // romanToInt
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));

        // reverseWords
        String s = "God Ding";
        System.out.println(reverseWords(s));
    }

	public String multiply(String num1, String num2) {
	    int m = num1.length(), n = num2.length();
	    int[] pos = new int[m + n];
	   
	    for(int i = m - 1; i >= 0; i--) {
	        for(int j = n - 1; j >= 0; j--) {
	            int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
	            int p1 = i + j, p2 = i + j + 1;
	            int sum = mul + pos[p2];

	            pos[p1] += sum / 10;
	            pos[p2] = (sum) % 10;
	        }
	    }  
	    
	    StringBuilder sb = new StringBuilder();
	    for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
	    return sb.length() == 0 ? "0" : sb.toString();
	}

	public String multiply2(String num1, String num2) {
        int n1 = num1.length(), n2 = num2.length();
        int[] products = new int[n1 + n2];
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int d1 = num1.charAt(i) - '0';
                int d2 = num2.charAt(j) - '0';
                products[i + j + 1] += d1 * d2;
            }
        }
        int carry = 0;
        for (int i = products.length - 1; i >= 0; i--) {
            int tmp = (products[i] + carry) % 10;
            carry = (products[i] + carry) / 10;
            products[i] = tmp;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : products) sb.append(num);
        while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int newAltitude = 0;

        for(int i=0; i<gain.length; i++) {
            newAltitude += gain[i];
            max = Math.max(max, newAltitude);
            System.out.println(max);
        } 

        return max;
    }

    public static double findMaxAverage(int[] arr, int k) {
      double maxAvg = Integer.MIN_VALUE; 
      double currAvg = 0;
      double currsum = 0;
         
      for(int i = 0; i<arr.length; i++) { // iterate the array.
          
          currsum += arr[i]; // adding the elements.

          if(i>=k-1) {      // keeping check at the window.
            currAvg = currsum/k;    // Calculating Average.
            maxAvg = Math.max(maxAvg,currAvg);  // Storing the maxAvg.
            currsum -= arr[i-(k-1)];    //Substract the first element of the prev window.
          }
        } 
      return maxAvg;
    }

    public String tictactoe(int[][] moves) {
    
        int i,arr[][]=new int[3][3];
        
        //storing moves
        for(i=0;i<moves.length;i++)
            if(i%2==0)
                arr[moves[i][0]][moves[i][1]]=1;
            else
                arr[moves[i][0]][moves[i][1]]=-1;
        
        //checking winner from rows and columns
        for(i=0;i<3;i++) {
            if(arr[i][0]==arr[i][1]&&arr[i][1]==arr[i][2])
                if(arr[i][0]==1)
                    return "A";
                else if(arr[i][0]==-1)
                    return "B";
            if(arr[0][i]==arr[1][i]&&arr[1][i]==arr[2][i])
                if(arr[0][i]==1)
                    return "A";
                else if(arr[0][i]==-1)
                    return "B";
        }
        
        //checking winner from main diagonal
        if(arr[0][0]==arr[1][1]&&arr[1][1]==arr[2][2])
            if(arr[0][0]==1)
                return "A";
            else if(arr[0][0]==-1)
                return "B";
        
        //checking winner from right diagonal
        if(arr[2][0]==arr[1][1]&&arr[1][1]==arr[0][2])
            if(arr[2][0]==1)
                return "A";
            else if(arr[2][0]==-1)
                return "B";
        
        if(moves.length<9)
            return "Pending";
        
        return "Draw";
    }

    public static int minOperations(String s) {
        int count0 = 0; // changes required when the string starts from 0
        int count1 = 0; // changes required when the string starts from 1
        
        for(int i = 0; i < s.length(); i++){
            
            // string starts with 1 => all chars at even places should be 1 and that at odd places should be 0
            if((i % 2 == 0 && s.charAt(i) == '0') || (i % 2 != 0 && s.charAt(i) == '1'))
                count1++;
                
            // string starts with 0 => all chars at even places should be 0 and that at odd places should be 1
            else if((i % 2 == 0 && s.charAt(i) == '1') || (i % 2 != 0 && s.charAt(i) == '0'))
                count0++;
        }
        
        // return minimum of the two
        return Math.min(count0, count1);
    }

    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != '*') {
                st.push(s.charAt(i));
            } else {
                st.pop();
            }
        }

        System.out.println(st);

        String ans = "";
        for(int i=0; i<st.size(); i++) {
            ans += st.pop();
        }

        return ans;
    }

    public static boolean canReach(String s, int minJump, int maxJump) {

        for(int i=0; i<s.length() - 1;) {
            System.out.println("hello");
            if(s.charAt(i+minJump) == '0') {
                i += minJump;
                System.out.println(i);
            } else if(s.charAt(i+maxJump) == '0') {
                i += maxJump;
                System.out.println(i);
            } else {
                return false;
            }
        }

        return true;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).mapToObj(candy -> candy + extraCandies >= max).collect(Collectors.toList());
    }

    // 1
    static int numOfStrings(String[] patterns, String word) {
        
        int count = 0;

        for(String s : patterns) {
            if(word.contains(s)) {
                count++;
            }
        }

        return count;
    }

    // 2
    static String restoreString(String s, int[] indices) {
        char[] newArr = new char[indices.length];
        int index = 0;

        for(int i : indices) {
            newArr[i] = s.charAt(index++);
        }

        // To convert char[] array to String.
        return new String(newArr);
    }

    // https://leetcode.com/problems/roman-to-integer/
    static int romanToInt(String s) {
        int ans = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                ans += map.get(s.charAt(i));
                System.out.println(ans);
            } else {
                ans -= map.get(s.charAt(i));
            }
        }

        return ans;
    }

    // https://leetcode.com/problems/robot-return-to-origin/
    static boolean judgeCircle(String moves) {
        
        int[] pos = { 0, 0 };

            for(int i = 0; i < moves.length(); i++) {
                if(moves.charAt(i) == 'U') {
                    pos[0]++;
                } else if (moves.charAt(i) == 'D') {
                    pos[0]--;
                } else if(moves.charAt(i) == 'R') {
                    pos[1]++;
                } else if (moves.charAt(i) == 'L') {
                    pos[1]--;
                }
            }

        return (pos[0] == 0 && pos[1] == 0);    
    }

    // begIndex should be less than endIndex.
    static String reversePrefix(String word, char ch) {
      
        int index = word.indexOf(ch);
        String ans1 = "";

        for (int i = index; i >= 0; i--) {
            ans1 += word.charAt(i);
        }

        String ans = ans1 + word.substring(index + 1, word.length());;

        return ans;
    }

    static String reverseWords(String s) {
        String[] str = s.split(" ");
        String ans = "";

        for(int i = 0; i < str.length; i++) {

            if(str[i] != " ") {
                String rev = "";

                for(int j = str[i].length() - 1; j >= 0; j--) {
                    ans += String.valueOf(str[i].charAt(j));
                }   
            
                ans += rev + " ";

            }

        }

        return ans.trim();
    }

    // https://leetcode.com/problems/long-pressed-name/
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;

        while(j < typed.length()) {
            
            if(i < name.length() && typed.charAt(j) == name.charAt(i)) {
                i++;
                j++;
            } 

            else if(j != 0 && typed.charAt(j) == name.charAt(i - 1)) {
                j++;
            } 

            else {
                return false;
            }
        }

        return i == name.length();  
    }

    // https://leetcode.com/problems/longest-common-prefix/
    // Intuition jo aayi thi :
    
    // snap back to reality
    // Arrays.sort(strs);

    // This statement will sort the array in lexiographical order and after that we will compare
    //  1st and last elements if they have some common substring then all the elements
    //  b/w 1st & last elements will also have that commmon substring bcoz it is lexiographically sorted.
    // Solution bhi likh dein zra
    // ----------------    ---------------------------

    // 
    static boolean isPalindrome(String s) {
        
        // replace the given string
        // with empty string
        // except the pattern "[^a-zA-Z0-9]

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String ans = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }



        if(s.equals(ans)) {
            return true;
        }

        return false;
    }

    // https://leetcode.com/problems/length-of-last-word/
    static int lengthOfLastWord(String s) {
        String[] newStr = s.trim().split(" ");

        return newStr[newStr.length - 1].length();
    }

    // https://leetcode.com/problems/goal-parser-interpretation/
    static String interpret(String command) {
        
        for(int i = 0; i < command.length(); i++) {
            command = command.replace("()", "o");
            command = command.replace("(al)", "al");
        }

        return command;
    }

    // 
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String one = "";
        String two = "";

        for(int i = 0; i < word1.length; i++) {
            one += word1[i];
        }

        for(int i = 0; i < word2.length; i++) {
            two += word2[i];
        }

        return one.equals(two);
    }

    // https://leetcode.com/problems/defanging-an-ip-address/
    static String defangIPaddr(String address) {
        
        return address.replace(".", "[.]");
    }

    static String defangIPaddr2(String address) {
        
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < address.length(); i++) {
            
            if(address.charAt(i) == '.') {
                ans.append("[.]");
            } else {
                ans.append(address.charAt(i));
            }
        }

        return ans.toString();
    }

    public String defangIPaddr3(String address) {
        
        StringBuilder ans = new StringBuilder();

        for(char c : address.toCharArray()) {
            if(c == '.') {
                ans.append("[.]");
            } else {
                ans.append(c);
            }
        }

        return ans.toString();
    }

    // 
    static int countOrNot(List<List<String>> items, int index, String ruleValue) {
        int count = 0;

        for( List<String> item : items) {
            count = item.get(index).equals(ruleValue) ? count + 1 : count;
        }

        return count;
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        if(ruleKey.equals("type")) {
            count = countOrNot(items, 0, ruleValue);
        } 

        else if(ruleKey.equals("color")) {
            count = countOrNot(items, 1, ruleValue);
        } 

        else if(ruleKey.equals("name")) {
            count = countOrNot(items, 2, ruleValue);
        }

        return count;
    }

    // https://leetcode.com/problems/detect-capital/
    public static boolean detectCapitalUse(String word) {
        boolean match1 = true, match2 = true, match3 = true;

        // Case-1: All Capital
        for (int i=0; i<word.length(); i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                match1 = false;
                break;
            }
        }

        if (match1) {
            return true;
        }

        // Case-2: All LowerCase
        for (int i=0; i<word.length(); i++) {
            if (!Character.isLowerCase(word.charAt(i))) {
                match2 = false;
                break;
            }
        }

        if (match2) {
            return true;
        }

        // Case-3: First letter uppercase
        if (!Character.isUpperCase(word.charAt(0))) {
            match3 = false;
        }

        if (match3) {
            for(int i=1; i<word.length(); i++) {
                if (!Character.isLowerCase(word.charAt(i))) {
                    match3 = false;
                    break;
                }
            }
        }

        if (match3) {
            return true;
        }

        return false;
    }

    // optimized
    public static boolean detect(String word) {
        if (word.length() == 1) {
            return true;
        }

        // case 1: All capital
        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            for (int i=2; i<word.length(); i++) {
                return false;
            }
        }
        // case 2 and case 3
        else {
            for (int i=1; i<word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }

        return true;
    }

    // 
    static boolean halvesAreAlike(String s) {
        
      s=s.toLowerCase();

      char[] vowels = {'a','e','i','o','u'};

      int count1 = 0;
      int count2 = 0;
        
      for(int i = 0; i < s.length() / 2; i++){
          for(int j = 0; j < vowels.length; j++){
                 
                 if(s.charAt(i) == vowels[j]){
                    count1++; 
                 }
              
                 if(s.charAt(i+s.length() / 2) == vowels[j]){
                    count2++;
                 }
            }
        }
       
       if(count1 == count2) {
        return true;
       }

        return false;  
    }
}