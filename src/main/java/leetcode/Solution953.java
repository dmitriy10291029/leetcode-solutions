package leetcode;

// https://leetcode.com/problems/verifying-an-alien-dictionary/description/

public class Solution953 {
    static final char MIN_CHAR = 'a' - 1;

    static int[] createOrderMap(String order) {
        int[] orderArrayMap = new int['z' - MIN_CHAR + 1];

        for (int i = 0; i < order.length(); i++) {
            orderArrayMap[order.charAt(i) - MIN_CHAR] = i + 1;
        }

        return orderArrayMap;
    }

    public boolean isAlienSorted(String[] words, String order) {
        int[] orderMap = createOrderMap(order);

        for (int k = 1; k < words.length; k++) {
            char[] lastWord = words[k - 1].toCharArray();
            char[] currWord = words[k].toCharArray();

            int t = 0;
            int tMax = Math.min(lastWord.length, currWord.length);
            for (; t < tMax; t++) {
                int res = orderMap[currWord[t] - MIN_CHAR] - orderMap[lastWord[t] - MIN_CHAR];
                if (res < 0) {
                    return false;
                } else if (res > 0) {
                    break;
                }
            }

            if (t == tMax && lastWord.length > currWord.length) {
                return false;
            }
        }

        return true;
    }
}
