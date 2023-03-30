
public class OneToN {
	public static void main(String[] args){
		printNos(100);
	}	
	
	static void printNos(int N) {
        
        if(N > 0) {
            printNos(N - 1);
            System.out.print(N + " ");
        }
       
      return;
    }

}