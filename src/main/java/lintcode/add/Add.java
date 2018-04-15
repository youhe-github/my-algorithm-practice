package lintcode.add;

import com.sun.tools.javac.util.Assert;

public class Add {
    public static void main(String[] args) {
        int a = 13;
        int b = 13;

        Assert.check(aplusb(a, b) == 26);
    }

   private static int aplusb(int a, int b) {
        int sum = a ^  b; //不考虑进位
        int carry = (a & b) << 1; //应该进位的大小

        if(b != 0) {
            return aplusb(sum, carry);
        } else {
            return sum;
        }
    }
}
