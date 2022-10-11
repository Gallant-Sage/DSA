public class Alike {
	public static void main(String[] args) {
		
		String s = "MerryChristmas";
		System.out.println(halvesAreAlike(s));
	}

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
