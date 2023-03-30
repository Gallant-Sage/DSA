// https://leetcode.com/problems/roman-to-integer/

import java.util.*;

public class Roman {
	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(romanToInt(s));
	}

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
}