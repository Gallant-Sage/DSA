import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// Permutations, Subsequence, Subset etc...

class Permutation {
	public static void main(String[] args) {
		// skip("", "baccadh");

        // System.out.println(skipString("baccadh"));

        // System.out.println(skipApple("baccappledh"));

        // System.out.println(skipAppNotApple("baccappledh"));

        // ------------- x --------------- x -----------------

        // System.out.println(permutationList("", "abc"));

        // System.out.println(permutationCount("", "abc"));

        // ------------- x --------------- x -----------------
        // subsequence("", "abc");

        System.out.println(subseqRet("", "abc"));

        int[] arr = { 1, 2, 2 };
        // System.out.println(subset(arr));

        // List<List<Integer>> ans = subset(arr);

        // for (List<Integer> list : ans) {
        //  System.out.println(list);
        // }

        // System.out.println(subsetDuplicate(arr));

	}

	// static boolean checkInclusion(String s1, String s2) {
    //     List<String> list = new ArrayList<>();
    //     list = permutation("", s2);
    //     System.out.println(list);
        
    //     if(list.contains(s1)) {
    //         return true;
    //     }
        
    //     return false;
    // }
    
    // static List<String> permutation(String p, String up) {
    //     if(up.isEmpty()) {
    //         List<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }
        
    //     char ch = up.charAt(0);
    //     List<String> ans = new ArrayList<>();
        
    //     for(int i = 0; i < p.length(); i++) {
    //         String first = up.substring(0, i);
    //         String second = up.substring(i, p.length());
    //         ans.addAll(permutation(first + ch + second, up.substring(1)));
    //     }
        
    //     return ans;
    // }

    
    // (1)==== basic recursion =====
    static void skip(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        
        if(ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skipString(String up) {
        if(up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        
        if(ch == 'a') {
            return skipString(up.substring(1));
        } else {
            return ch + skipString(up.substring(1));
        }
    }

    static String skipApple(String up) {
        if(up.isEmpty()) {
            return "";
        }

        if(up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        if(up.isEmpty()) {
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
    // --------------------------- end ---------------------------

    // (2)
    static void subseqAscii(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        // either take the element
        subseqAscii(p + ch, up.substring(1));
        // or ignore the element
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subseqAsciiRet(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subseqAsciiRet(p, up.substring(1));
        ArrayList<String> third = subseqAsciiRet(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;       
    }

    // (3) ======== Permutations ========
    // in this every char should be present, we do not ignore any char.
    // printing ans 
    static void permutation(String p, String up) {
        
        if (up.isEmpty()) {
            System.out.println(p);
            return; 
        }

        char ch = up.charAt(0);

        // in this question there will be variable no. of func calls(p+1 func calls) on 
        // every single level, so we have used a 'for loop' to make required no. of recursion     
        // calls for every level.
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }

    // returning arraylist
    static ArrayList<String> permutationList(String p, String up) {
        
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list; 
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationList(f + ch + s, up.substring(1)));
        }

        return ans;
    }

    // returning no. of permutation.
    static int permutationCount(String p, String up) {
        
        if (up.isEmpty()) {
            return 1; 
        }

        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count += permutationCount(first + ch + second, up.substring(1));
        }

        return count;
    }

    // 3) Subsequence --> for strings
    // in this we take one char and ignore other.
    static void subsequence(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subsequence(p + ch, up.substring(1));
        subsequence(p, up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        // System.out.println(left);
        ArrayList<String> right = subseqRet(p, up.substring(1));
        // System.out.println(right);

        left.addAll(right);

        return left;        
    }

    // 4) Subset --> for arrays 
    // in this we take one char and ignore other.
    static List<List<Integer>> subset(int[] arr) {
        
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();

            for (int i = 0; i < n; i++) {
                
                // internal will be a copy of external list
                List<Integer> internal = new ArrayList<>(outer.get(i));

                // System.out.println("copied list is:" + internal);
                
                // then, we will add numbers to the copy of the list.
                internal.add(num);
                
                // System.out.println("this is internal:"+ i + " " + internal);
                
                outer.add(internal);
                
                // System.out.println("this is outer:"+ i + " " + outer);

                // System.out.println();
            }
        }

        return outer;
    }

    // for duplicates
    static List<List<Integer>> subsetDuplicate(int[] arr) {
        // because duplicates need to be together.
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            
            // if current & previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();

            for (int j = start; j < n; j++) {

                List<Integer> internal = new ArrayList<>(outer.get(j));
            
                internal.add(arr[i]);
                
                outer.add(internal);
            }
        }

        return outer;
    }
}