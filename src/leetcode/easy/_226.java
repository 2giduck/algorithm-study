package leetcode.easy;

public class _226 {
      public class TreeNode {
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

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        var temp = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = temp;

        return root;
    }
}
