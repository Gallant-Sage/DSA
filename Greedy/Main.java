import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] s = { 1, 3, 0, 5, 8, 5 };
        // already sorted
        int[] e = { 2, 4, 6, 7, 9, 9 };
        activitySelection(s, e);

    }

    public static int activitySelection(int[] start, int[] end) {
        // initialized with 1 bcoz 1st activity will be completed fastest
        // as the end-time is sorted
        int maxActivity = 1;
        int lastEnd = end[0];
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxActivity++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println(maxActivity);
        return maxActivity;
    }
}