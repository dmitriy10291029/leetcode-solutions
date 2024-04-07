package leetcode;

// https://leetcode.com/problems/merge-two-sorted-lists/description/

public class Solution021 {
    public static class ListNode {
        int val;
        Solution021.ListNode next;

        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, Solution021.ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode root;
        if (list1.val > list2.val) {
            root = new ListNode(list2.val);
            list2 = list2.next;
        } else {
            root = new ListNode(list1.val);
            list1 = list1.next;
        }

        ListNode curr = root;
        while (list1 != null || list2 != null) {
            if (list1 == null || (list2 != null) && list1.val > list2.val) {
                curr = curr.next = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                curr = curr.next = new ListNode(list1.val);
                list1 = list1.next;
            }
        }

        return root;
    }
}
