package leetcode;

// https://leetcode.com/problems/first-unique-character-in-a-string/description/

import java.util.HashMap;
import java.util.Map;

public class Solution387 {
    // 1. HashMap Solution
    public int firstUniqChar1(String s) {
        Map<Character, Integer> m = new HashMap<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (m.containsKey(ch)) {
                m.replace(ch, 1000000);
            } else {
                m.put(ch, i);
            }
        }

        int answer = 1000000;
        for (var e : m.entrySet()){
            if (answer > e.getValue()) {
                answer = e.getValue();
            }
        }
        return answer == 1000000 ? -1 : answer;
    }

    // 2. HashMap on array solution
    public int firstUniqChar2(String s) {
        final int max_int = 1000000;

        int[] firstIndex = new int['z' + 1];

        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (firstIndex[ch] != 0) {
                firstIndex[ch] = max_int;
            } else {
                firstIndex[ch] = i + 1;
            }
        }

        int answer = max_int;
        for (int i = 'a'; i <= 'z'; i++) {
            if (answer > firstIndex[i] && firstIndex[i] != 0) {
                answer = firstIndex[i];
            }
        }

        return answer == max_int ? -1 : answer - 1;
    }

    // 3. Count solution (best)
    public int firstUniqChar3(String s) {
        int[] count = new int['z' - 'a' + 1];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
