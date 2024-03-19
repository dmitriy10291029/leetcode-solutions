package leetcode;

// https://leetcode.com/problems/two-sum/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution001 {
    public int[] twoSum(int[] nums, int target) {

        // Создаем hashmap пар {значение, лист индексов}
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            } else {
                var list = new ArrayList<Integer>();
                list.add(i);
                map.put(nums[i], list);
            }
        }

        // Ищем второе значение, которое даст в сумме target
        int[] answer = new int[2];
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            int neededKey = target - key;

            // Отдельный случай для пары из двух равных чисел
            if (key == neededKey && entry.getValue().size() > 1) {
                answer[0] = entry.getValue().get(0);
                answer[1] = entry.getValue().get(1);
            } else {
                // общий случай
                var neededValue = map.get(neededKey);
                if (neededValue != null) {
                    answer[0] = entry.getValue().get(0);
                    answer[1] = neededValue.get(0);
                    return answer;
                }
            }
        }
        return answer;
    }
}