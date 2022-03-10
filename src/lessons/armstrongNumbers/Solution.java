package lessons.armstrongNumbers;

import java.util.Arrays;

/* 
Алгоритмы-числа
*/

public class Solution {


    public static void main(String[] args) {
        ArmstrongNumbers am = new ArmstrongNumbers();
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(am.getNumbers(407)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(am.getNumbers(134123412341234L)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }


}
