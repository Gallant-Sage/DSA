import java.util.ArrayList;

// linear search using recursion.
public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 1, 18, 9 };
		
		// System.out.println(search(arr, 1, 0));
        // 
        // System.out.println(searchIndex(arr, 1, 0));
		// 
		// System.out.println(searchIndexLast(arr, 1, arr.length - 1));
        // 
        // searchAllIndex(arr, 1, 0);
		// System.out.println(list);
        
        ArrayList<Integer> ans = findAllIndex2(arr, 1, 0);
		System.out.println(ans);
	}

	static boolean search(int[] arr, int target, int ind) {
		if(ind == arr.length) {
			return false;
		}

		return arr[ind] == target || search(arr, target, ind + 1);  
	}
    
    
    // linear search from start.
	static int searchIndex(int[] arr, int target, int ind) {
		if(ind == arr.length) {
			return -1;
		}

		if(arr[ind] == target) {
			return ind;
		}

		else {
			return searchIndex(arr, target, ind + 1);
		}
	}

    
    // linear search from the end.
	static int searchIndexLast(int[] arr, int target, int ind) {
		if(ind == -1) {
			return -1;
		}

		if(arr[ind] == target) {
			return ind;
		} else {
			return searchIndexLast(arr, target, ind - 1);
		}
	}

	
	// for duplicate numbers.
	static ArrayList<Integer> list = new ArrayList<>(); 
	
	static void searchAllIndex(int[] arr, int target, int ind) {
		if(ind == arr.length) {
			return;
		}

		if(arr[ind] == target) {
			list.add(ind);
		}

		searchAllIndex(arr, target, ind + 1);
	}


	// arraylist as an argument.
	static ArrayList<Integer> findAllIndex(int[] arr, int target, int ind, ArrayList<Integer> list) {
		if(ind == arr.length) {
			return list;
		}

		if(arr[ind] == target) {
			list.add(ind);
		}

		return findAllIndex(arr, target, ind + 1, list);
	}

	// not passing arraylist in args.
	public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int ind) {
        
        ArrayList<Integer> list = new ArrayList<>();
		if(ind == arr.length) {
			return list;
		}
    	
    	// this will contain ans for the current function call only.
		if(arr[ind] == target) {
			list.add(ind);
		}
        
        ArrayList<Integer> ansFromBelow = findAllIndex2(arr, target, ind + 1);
		// System.out.println(ansFromBelow);
		list.addAll(ansFromBelow);
		
		return list;
	}
}
	