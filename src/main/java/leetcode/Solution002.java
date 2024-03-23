package leetcode;

// https://leetcode.com/problems/add-two-numbers/submissions/1211837451/

public class Solution002 {
    public static class ListNode {
        int val;
        Solution002.ListNode next;

        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, Solution002.ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumRoot = new ListNode();
        ListNode sum = sumRoot;
        int digitsSum = 0;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                digitsSum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                digitsSum += l2.val;
                l2 = l2.next;
            }
            sum = sum.next = new ListNode(digitsSum % 10);
            digitsSum /= 10;
        }
        if (digitsSum != 0) {
            sum.next = new ListNode(digitsSum);
        }

        return sumRoot.next;
    }
}
