public class Solution {
    static int count = 0;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }

    public static int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
    }

    public static TreeNode helper(TreeNode root, int k) {
        if (root == null) {
            return null;
        }

        TreeNode left = helper(root.left, k);
        System.out.println("Left" + left);

        if (left != null) {
            return left;
        }

        count++;

        if (count == k) {
            return root;
        }

        System.out.println("Right" + root.right);
        return helper(root.right, k);
    }
}
