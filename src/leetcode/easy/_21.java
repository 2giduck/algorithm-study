package leetcode.easy;

public class _21 {
    public static void main(String[] args) {
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val <= list2.val) return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
        if(list2.val < list1.val) return new ListNode(list2.val, mergeTwoLists(list2.next, list1));

        return null;
    }
}
