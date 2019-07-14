import org.junit.Test;

public class MyTest {
    private final double PERCENT = 0.00165;

    @Test
    public void test() {
        double start = 21780f;
        double end = start * 2;
        double current = start;
        System.out.println(String.format("start: %s, \tend: %s, \tcurrent: %s", String.valueOf(start), String.valueOf(end), String.valueOf(current)));

        int n = 1;
        double yearPercent = 0f;
        while (current < end) {
            double add = current * PERCENT;
            current = current + add;
            System.out.println(String.format("n: %s, \tcurrent: %s, \tadd: %s", n, String.valueOf(current), String.valueOf(add)));

            if(n == 365) {
                yearPercent = (current - start) / start;
            }

            n = n + 1;
        }

        System.out.println(yearPercent * 100.0);

        System.out.println(start * 0.2 / (start * (1f + yearPercent)));

    }
}
