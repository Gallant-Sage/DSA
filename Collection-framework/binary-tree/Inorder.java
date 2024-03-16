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

public class Inorder {
	private static List<Integer> ans = new ArrayList<>();

	private static void bfs(TreeNode root) {
		if(root == null) {
			return;
		}

		ans.add(root.val);
		bfs(root.left);
		bfs(root.right);
	}

	public static List<Integer> inorderTraversal(TreeNode root) {
		bfs(root);
		return ans;
	}
}