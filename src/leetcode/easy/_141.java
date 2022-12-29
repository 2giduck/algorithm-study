package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class _141 {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    Set<ListNode> set = new HashSet<>();

    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        if(set.contains(head)) return true;
        set.add(head);

        return hasCycle(head.next);
    }
}
