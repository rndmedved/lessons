package lessons.stepik.modul2.task2.ex2;

public class Solution {


    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));
        System.out.println(isPowerOfTwo(-128));
        System.out.println(isPowerOfTwo(99));
        System.out.println(isPowerOfTwo(-1));
        System.out.println(isPowerOfTwo(0));
        System.out.println(Integer.bitCount(2));
        System.out.println(Integer.bitCount(128));
        System.out.println(Integer.bitCount(3));
    }

    public static boolean isPowerOfTwo(int value){
        if (value == 0) return false;
        return Integer.toBinaryString(Math.abs(value)).indexOf("1") ==
                Integer.toBinaryString(Math.abs(value)).lastIndexOf("1");
    }
    /*
        Можно было решить через Integer.bitCount(int value); этот метод возвращает количество бит  -1 в числе
        Returns the number of one-bits in the two's complement binary representation of the specified int value.
     */
}
