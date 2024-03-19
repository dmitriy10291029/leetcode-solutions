package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution203Test {
    Solution203 s = new Solution203();

    Solution203.ListNode of(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        Solution203.ListNode head = new Solution203.ListNode();
        Solution203.ListNode cur = head;
        head.val = nums[0];
        System.out.print(nums[0] + " ");
        Solution203.ListNode prev = head;
        for (int i = 1; i < nums.length; ++i) {
            prev = cur;
            cur = prev.next = new Solution203.ListNode();
            cur.val = nums[i];
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return head;
    }

    boolean compare(Solution203.ListNode l1, Solution203.ListNode l2) {
        var cur1 = l1;
        var cur2 = l2;
        while (cur1 != null && cur2 != null) {
            if (cur1.val != cur2.val) {
                return false;
            }
            System.out.println(String.valueOf(cur1.val) + " " + String.valueOf(cur2.val));
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        System.out.println();
        return cur1 == null && cur2 == null;
    }

    @Test
    void TestHelpMethods() {
        int[] input1 = {1,2,6,3,4,5,6};
        int[] input2 = {};
        int[] input3 = {1,2,6,3,4,5};
        int[] input4 = {1,2,6,3,5,6};

        assertTrue(compare(of(input1), of(input1)));
        assertFalse(compare(of(input1), of(input2)));
        assertFalse(compare(of(input1), of(input3)));
        assertFalse(compare(of(input3), of(input4)));
    }

    @Test
    void Example1() {
        int[] input = {1,2,6,3,4,5,6};
        int val = 6;
        int[] output = {1,2,3,4,5};

        assertTrue(compare(s.removeElements(of(input), val), of(output)));
    }

    @Test
    void Example2() {
        int[] input = {};
        int val = 1;
        int[] output = {};

        assertTrue(compare(s.removeElements(of(input), val), of(output)));
    }

    @Test
    void Example3() {
        int[] input = {7,7,7,7};
        int val = 7;
        int[] output = {};

        assertTrue(compare(s.removeElements(of(input), val), of(output)));
    }
}