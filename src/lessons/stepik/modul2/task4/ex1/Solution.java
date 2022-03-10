package lessons.stepik.modul2.task4.ex1;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        BigInteger fact = factorial(-5);
        System.out.println(fact.toString());
    }


    public static BigInteger factorial(int value){
        BigInteger fact = BigInteger.ONE;
        if (value >= 0){
            for (int i = 1; i <= value; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
        } else {
            System.out.println("----");
            for (int i = -1; i >= value; i--) {
                fact = fact.multiply(BigInteger.valueOf(i));
                System.out.println(i);
            }
        }

        return fact;
    }
}
