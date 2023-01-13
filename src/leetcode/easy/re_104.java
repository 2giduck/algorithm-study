package leetcode.easy;

public class re_104 {

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

    public int maxDepth(TreeNode root) {
        return getMaxLength(root);
    }

    public int getMaxLength(TreeNode root) {
        if(root == null) return 0;

        int l = getMaxLength(root.left) + 1;
        int r = getMaxLength(root.right) + 1;
        return Math.max(l, r);
    }
}
