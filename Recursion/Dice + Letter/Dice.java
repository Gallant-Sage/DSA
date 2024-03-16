import java.util.ArrayList;
import java.util.List;

public class Dice {
	public static void main(String[] args){
		System.out.println(padRet("", "12"));

		// diceSum("", 4);

		// System.out.println(diceRet("", 4));
	}	

	// letter combination problem
	public static void pad(String p, String up) {
        if (up.isEmpty()) {
        	System.out.println(p);
        	return; 
        }

        int digit = up.charAt(0) - '0';

        for (int i=(digit - 1) * 3; i<(digit * 3); i++) {
        	char ch = (char)('a' + i);
        	pad(p + ch, up.substring(1));
        }
    }

    // returning arraylist
    public static List<String> padRet(String p, String up) {
    	if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list; 
        }

        int digit = up.charAt(0) - '0';

        List<String> ans = new ArrayList<>();

        for (int i=(digit - 1) * 3; i<(digit * 3); i++) {
        	char ch = (char)('a' + i);
        	ans.addAll(padRet(p + ch, up.substring(1)));
        }

        return ans;

    }

    // return count
    public static int padCount(String p, String up) {
    	if (up.isEmpty()) {
            return 1; 
        }

        int count = 0;
        int digit = up.charAt(0) - '0';

        for (int i = 0; i <= p.length(); i++) {
            char ch = (char)('a' + i);
        	count += padCount(p + ch, up.substring(1));
        }

        return count;
    }

	// dice problem
	public static void diceSum(String p, int target) {
		if (target == 0) {
			System.out.println(p);
			return;
		}

		for (int  i = 1; i <= 6 && i <= target; i++) {
			diceSum(p + i, target - i);
		}
	}

	public static ArrayList<String> diceRet(String p, int target) {
		if (target == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		ArrayList<String> list = new ArrayList<>();

		for (int  i = 1; i <= 6 && i <= target; i++) {
			list.addAll(diceRet(p + i, target - i));
		}

		return list;
	}


	// Custom die with more than 6 faces. i.e, 7, 8, 9....
	static void diceFace(String p, int target, int face) {
		if (target == 0) {
			System.out.println(p);
			return;
		}

		for (int  i = 1; i <= face && i <= target; i++) {
			diceFace(p + i, target - i, face);
		}
	}
}
	
	
