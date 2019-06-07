package leetcode.code;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TwoSum {

    @Test
    public void testTwoSum() {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;

        int[] results = twoSum(nums, target);
        System.out.println(results[0] + ", " + results[1]);
    }

    public int[] twoSum(int[] nums, int target) {
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