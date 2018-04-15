package poj.add;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(add(a, b));
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
