package leetcode.medium;

import java.util.*;

public class _102 {

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();

            for(int i = 0; i<size; i++) {
                TreeNode node = queue.poll();
                if(node == null) continue;

                temp.add(node.val);

                queue.add(node.left);
                queue.add(node.right);
            }

            if(temp.isEmpty()) break;
            result.add(temp);
        }

        return result;
    }
}
