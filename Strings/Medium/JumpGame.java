
public class JumpGame {
	public static void main(String[] args){
			
	}

	static boolean canReach(String s, int minJump, int maxJump) {
        int j = 0;
        for (int i = 0 ; i < s.length() - minJump;) {
        	j = Math.min(i + maxJump, s.length() - 1);
        	if (s.charAt(i + minJ) == '0') {
        		i = j
        	}
        }
    }	
}
	
	
