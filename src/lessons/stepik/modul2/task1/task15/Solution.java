package lessons.stepik.modul2.task1.task15;

public class Solution {
    public static void main(String[] args) {
        int var = flipBit(3, 4);
        System.out.println( var );
        System.out.println(Integer.toBinaryString(var));
    }


    public static int flipBit(int value, int bitIndex) {
        byte[] bytes = new byte[32];
        if (value < 0) {
            bytes[31] = 1;
            value = Integer.MAX_VALUE + value +1;
        }
        for (int i = 0; i < bytes.length - 1; i++) {
            bytes[i] = (byte) (value % 2);
            if (i == bitIndex - 1) bytes[i] = (byte) ((bytes[i] + 1) % 2);
            value/=2;
        }
        if (bitIndex == 32) bytes[31] = (byte) ((bytes[31] + 1) % 2);

        for (int i = bytes.length-1; i >= 0; i--) {
            System.out.print(bytes[i]);
        }
        System.out.println();
        int power = 1;
        int result = 0;
        for (int i = 0; i < bytes.length - 1; i++) {

            result = result + bytes[i] * power;
            power*=2;
        }
        if (bytes[31] == 1) result-=Integer.MAX_VALUE + 1;


        return result; // put your implementation here
    }
}
