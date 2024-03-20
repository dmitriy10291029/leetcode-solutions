package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution929Test {
    Solution929 s = new Solution929();

    @Test
    void Example1() {
        String[] input = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int output = 2;
        assertEquals(output, s.numUniqueEmails(input));
    }

    @Test
    void Example2() {
        String[] input = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        int output = 3;
        assertEquals(output, s.numUniqueEmails(input));
    }

    @Test
    void Example3() {
        String[] input = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        int output = 1;
        assertEquals(output, s.numUniqueEmails(input));
    }
}