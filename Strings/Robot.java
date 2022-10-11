public class Robot {
	public static void main(String[] args) {
		String moves = "RRDD";
		System.out.println(judgeCircle(moves));
	}

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
}

     