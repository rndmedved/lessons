package lessons.stepik.module3.ex5.Example3;

import java.math.BigDecimal;

public class Lambda {
    public static void main(String[] args) {
        Timer timer = new Timer();
        long t = timer.measureTime(Lambda::BigDecimalPow);
        System.out.println(t);
    }

    private static void BigDecimalPow() {
        new BigDecimal("123456").pow(100000);
    }
}
