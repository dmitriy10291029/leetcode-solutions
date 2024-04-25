package leetcode;

// https://leetcode.com/problems/car-fleet/

public class Solution853 {
    public int carFleet(int target, int[] position, int[] speed) {
        float[] times = new float[target];

        for (int i = 0; i < position.length; i++) {
            times[position[i]] = ((float)(target - position[i])) / speed[i];
        }

        int ans = 0;
        float lastTime = 0;
        
        for (int i = target - 1; i >= 0; i--) {
            if (times[i] != 0) {
                if (lastTime < times[i]) {
                    lastTime = times[i];
                    ans++;
                }
            }
        }

        return ans;
    }
}
