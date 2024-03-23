package leetcode;

// https://leetcode.com/problems/first-bad-version/

public class Solution278 {
    int getMid(int f, int l) {
        // because f+l may be more 2^32 - 1
        return l / 2 + f / 2 + (l % 2 + f % 2) / 2;
    }

    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;

        while (last - first > 1) {
            int mid = getMid(first, last);

            if (isBadVersion(mid)) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return first;
    }

    public int bad;

    public boolean isBadVersion(int version) {
        return version >= bad;
    }
}