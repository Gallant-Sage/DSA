public class Pressed {
	public static void main(String[] args) {
		String name = "alex";
		String typed = "aaleex";

		System.out.println(isLongPressedName());
	}

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
}