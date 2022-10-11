import java.util.*;

public class CountItems {
	public static void main(String[] args) {
		
	}

	static int countOrNot(List<List<String>> items, int index, String ruleValue) {
		int count = 0;

		for( List<String> item : items) {
			count = item.get(index).equals(ruleValue) ? count + 1 : count;
		}

		return count;
	}

	static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        if(ruleKey.equals("type")) {
        	count = countOrNot(items, 0, ruleValue);
        } 

        else if(ruleKey.equals("color")) {
        	count = countOrNot(items, 1, ruleValue);
        } 

        else if(ruleKey.equals("name")) {
        	count = countOrNot(items, 2, ruleValue);
        }

        return count;
    }
}