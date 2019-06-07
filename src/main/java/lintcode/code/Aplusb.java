package lintcode.code;

import com.sun.tools.javac.util.Assert;
import org.junit.Test;

public class Aplusb {

    @Test
    public void testAplusb() {
        int a = 13;
        int b = 13;

        Assert.check(aplusb(a, b) == 26);
    }

    public int aplusb(int a, int b) {
        int sum = a ^  b; //不考虑进位
        int carry = (a & b) << 1; //应该进位的大小

        if(b != 0) {
            return aplusb(sum, carry);
        } else {
            return sum;
        }
    }

}