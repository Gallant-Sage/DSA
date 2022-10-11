import java.util.Arrays;

public class Decrypt {
	public static void main(String[] args) {
		// char out = 'a';
		// for(int i = 0; i < 5; i++) {
		// 	out = (char) (out + 1);
		// 	System.out.println(out);
		// }

		// char ch = 'a';
		// int count = 1;
		// for(int i = 0; i < 27; i++) {
		// 	if(ch < 'j') {
		// 		System.out.println(count++);
		// 		ch++;
		// 	} else {
				
		// 	}
		// }

	}

	// static String freqAlphabets(String s) {
 //        s = s.split("#");
		   StringBuilder ans= new StringBuilder();
           int n = s.length();
           for(int i = 0; i < n;){
               if(i+2 < n && s.charAt(i+2) =='#'){
                   int num = Integer.parseInt(s.substring(i, i+2));
                   char c = (char)(96 + num);
                   ans.append(c);
                   i += 3;
               }
               else{
                   char c= (char)('a'+s.charAt(i)-'1');
                   ans.append(c);
                   i++;
               }
        	}
       		
       		return ans.toString();
 //    }
}