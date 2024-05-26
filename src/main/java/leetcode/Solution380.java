package leetcode;

// https://leetcode.com/problems/insert-delete-getrandom-o1/description/

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Solution380 {
    static class RandomizedSet {
        private final HashMap<Integer, Integer> numerValueMap;
        private final HashMap<Integer, Integer> valueNumerMap;

        public RandomizedSet() {
            numerValueMap = new HashMap<>();
            valueNumerMap = new HashMap<>();
        }

        public boolean insert(int val) {
            if (valueNumerMap.containsKey(val)) {
                return false;
            }
            numerValueMap.put(numerValueMap.size(), val);
            valueNumerMap.put(val, valueNumerMap.size());

            return true;
        }

        public boolean remove(int val) {
            if (!valueNumerMap.containsKey(val)) {
                return false;
            }
            Integer lastValue = numerValueMap.get(numerValueMap.size() - 1);
            Integer currNumer = valueNumerMap.get(val);

            numerValueMap.put(currNumer, lastValue);
            valueNumerMap.put(lastValue, currNumer);

            numerValueMap.remove(numerValueMap.size() - 1);
            valueNumerMap.remove(val);

            return true;
        }

        public int getRandom() {
            int randomNumer = ThreadLocalRandom.current().nextInt(numerValueMap.size());
            return numerValueMap.get(randomNumer);
        }
    }
}
