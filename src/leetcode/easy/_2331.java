package leetcode.easy;

public class _2331 {

    public static void main(String[] args) {
        var t1 = new TreeNode(0);
        var t2 = new TreeNode(1);
        var t3 = new  TreeNode(3, t1, t2);
        var t4 = new TreeNode(1);
        var t5 = new TreeNode(2, t4, t3);
        System.err.println(evaluateTree(t5));

        var t = new TreeNode(0);
        System.err.println(evaluateTree(t));
    }

     public static class TreeNode {
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

    public static boolean evaluateTree(TreeNode root) {
        if (root.left == null)
            return root.val == 1;

        return root.val == 2 ?
                evaluateTree(root.left) || evaluateTree(root.right) :
                evaluateTree(root.left) && evaluateTree(root.right);
    }
}
