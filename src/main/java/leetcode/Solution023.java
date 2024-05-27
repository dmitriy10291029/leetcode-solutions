package leetcode;

// https://leetcode.com/problems/merge-k-sorted-lists/

import java.util.PriorityQueue;

public class Solution023 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // add heads of lists
        for (ListNode node : lists) {
            if (node != null) {
                heap.add(node);
            }
        }

        ListNode startNode = new ListNode();
        ListNode curr = startNode;
        while (!heap.isEmpty()) {
            ListNode min = heap.poll();

            curr = curr.next = new ListNode(min.val);

            if (min.next != null) {
                heap.add(min.next);
            }
        }

        return startNode.next;
    }
}
