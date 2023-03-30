// https://leetcode.com/problems/repeated-string-match/

public class Repeated{
    static int repeatedStringMatch(String a,String b){
        int count = 0;
        String check = "";
        
        while(check.length() < b.length()) {
            check += a;
            count++;
            System.out.println(count);
        }

        if (check.contains(b)) {
            return count;
        }

        check += a;

        if (check.contains(b)) {
            return ++count;
        }

        return -1;
    }

    public static void main(String[] args){
        System.out.println(repeatedStringMatch("abc", "wxyz"));
    }  
}
        
