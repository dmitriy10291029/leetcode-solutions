package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] jewelsSet = new boolean['z' + 1];
        for (int i = 0; i < jewels.length(); i++) {
            jewelsSet[jewels.charAt(i)] = true;
        }
        int answer = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewelsSet[stones.charAt(i)]) {
                answer++;
            }
        }
        return answer;
    }
}
//  Another Solution
//    public int numJewelsInStones(String jewels, String stones) {
//        Set<Character> jewelsSet = new HashSet<>();
//        for (int i = 0; i < jewels.length(); i++) {
//            jewelsSet.add(jewels.charAt(i));
//        }
//        int answer = 0;
//        for (int i = 0; i < stones.length(); i++) {
//            if (jewelsSet.contains(stones.charAt(i))) {
//                answer++;
//            }
//        }
//        return answer;
//    }

