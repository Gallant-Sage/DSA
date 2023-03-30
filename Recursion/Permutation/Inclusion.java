import java.util.ArrayList;
import java.util.List;

class Inclusion {
    
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }

    static boolean checkInclusion(String s1, String s2) {
        
        List<String> list = new ArrayList<>();
        list = permutation("", s2);
        System.out.println(list);
        
        if(list.contains(s1)) {
            return true;
        }
        
        return false;
        
    }
    
    static List<String> permutation(String p, String up) {
        if(up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();
        
        for(int i = 0; i < p.length(); i++) {
            String first = up.substring(0, i);
            String second = up.substring(i, p.length());
            ans.addAll(permutation(first + ch + second, up.substring(1)));
        }
        
        return ans;
    }
}