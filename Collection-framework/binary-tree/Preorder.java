import java.util.*;
class TreeNode {
    int val;
    TreeNode left;   
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Preorder {
	private static List<Integer> ans = new ArrayList<>();

	private static void dfs(TreeNode root) {
		if(root == null) {
			return;
		}

		ans.add(root.val);
		dfs(root.left);
		dfs(root.right);
	}

	public static List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return ans;
    }
}