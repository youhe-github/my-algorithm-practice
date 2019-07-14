package leetcode.code;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ReverseInteger {

    @Test
    public void test () {
        Map<Integer, Integer> testMap = new HashMap<>();
        testMap.put(123, 321);
        testMap.put(-123, -321);
        testMap.put(120, 21);

        for (Integer key : testMap.keySet()) {
            Assert.assertEquals(reverse(key), testMap.get(key).intValue());
        }
    }

    /**
     1. 负数的处理
     2. 末尾有0时的处理
     3. 反转后是否越界的处理
     * @param x
     * @return
     */
    public int reverse(int x) {
        if (x == 0) {
            return x;
        }

        boolean flag = false;
        if(x < 0) {
            x = 0 - x;
            flag = true;
        }

        long sum = 0;
        while (x > 0) {
            sum = sum * 10 + x % 10;
            x = x / 10;
        }

        if (flag) {
            sum = 0L - sum;
        }
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)sum;
    }
}
