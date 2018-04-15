package lintcode;

import com.sun.tools.javac.util.Assert;

public class Add {
    public static void main(String[] args) {
        int a = 13;
        int b = 13;

        Assert.check(add(a, b) == 26);
    }

   private static int add(int a, int b) {
        int sum = a ^  b; //不考虑进位
        int carry = (a & b) << 1; //应该进位的大小

        if(b != 0) {
            return add(sum, carry);
        } else {
            return sum;
        }
    }
}
