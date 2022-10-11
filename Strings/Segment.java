
public class Segment {
    
    static boolean checkOnesSegment(String s) {
        return s.contains("11");
    }

    public static void main(String[] args){
        System.out.println(checkOnesSegment("1001"));
    }    
}