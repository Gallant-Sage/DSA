// https://leetcode.com/problems/swap-adjacent-in-lr-string/

import java.util.*;

public class LR {
	static boolean canTransform(String start, String end) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < start.length() - 2; i += 2) {
        	String s1 = start.substring(i, i+2);

        	if (s1 == "RX") {
        		ans.append("X");
        		ans.append("R");
        	}

        	if (s1 == "XL") {
        		ans.append("L");
        		ans.append("X");
        	}
        }

        if (ans.length() < start.length()) {
        	ans.append(start.charAt(start.length() - 1));
        }

        System.out.println(ans);

        String newAns = ans.toString();

        if (newAns == end) {
        	return true;
        }

        return false;
    }
	
	public static void main(String[] args){
		System.out.println(canTransform("RXXLRXRXL", "XRLXXRRLX"));
	}	
}
