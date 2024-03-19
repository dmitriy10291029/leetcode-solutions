package leetcode;

// https://leetcode.com/problems/remove-linked-list-elements/

public class Solution203 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode current = head.next;

        while (current != null) {
            if (current.val != val) {
                prev = current;
            } else {
                prev.next = current.next;
            }
            current = current.next;
        }
        return head;
    }
}
