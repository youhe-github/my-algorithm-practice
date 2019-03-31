package leetcode.code;

import java.util.HashMap;
import java.util.Map;

public class num1 {
    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;

        int[] results = twoSum(nums, target);
        System.out.println(results[0] + ", " + results[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> records = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            if(records.containsKey(nums[i])) {
                return new int[]{records.get(nums[i]), i};
            } else {
                records.put(target - nums[i], i);
            }
        }

        throw new IllegalArgumentException("no solution.");
    }
}
