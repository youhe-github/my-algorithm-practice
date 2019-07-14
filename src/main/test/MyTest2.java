import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MyTest2 {
    @Test
    public void test() {
        Map<Double, Double> m1 = new HashMap<>();
        Map<Double, Double> m2 = new HashMap<>();

        m1.put(1d, 2.55);
        m1.put(2d, 3.30);
        m1.put(3d, 2.65);

        m2.put(1d, 2.06);
        m2.put(2d, 3.32);
        m2.put(3d, 2.69);

        double a = 0d;
        double b = 0d;
        double c = 0d;

        a = 100d / 2.65;
        b = 100d / 3.44;
        c = 100d / 2.75;

        System.out.println(a + b + c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
