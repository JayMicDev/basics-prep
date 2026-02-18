package leetcode.week1;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    // Optimizing Solution with HashMap
    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complementNum = target - currentNum;
            if (map.containsKey(complementNum))
                return new int[]{map.get(complementNum), i};
            else
                map.put(currentNum, i);
        }
        return new int[]{-1, -1};
    }
}