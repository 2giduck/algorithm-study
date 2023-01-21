package leetcode.easy;

public class _543 {
  
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

    private int result;

    public int diameterOfBinaryTree(TreeNode root) {
        result = 0;

        length(root);

        return result;
    }

    public int length(TreeNode root) {
        if(root == null) return 0;

        int l = length(root.left);
        int r = length(root.right);

        result = Math.max(l + r , result);

        return Math.max(l, r) + 1;
    }
}
