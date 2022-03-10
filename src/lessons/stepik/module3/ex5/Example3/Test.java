package lessons.stepik.module3.ex5.Example3;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("2");
        bd = bd.pow(10);
        System.out.println(bd);
    }
}
