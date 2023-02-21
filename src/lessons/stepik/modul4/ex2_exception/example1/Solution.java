package lessons.stepik.modul4.ex2_exception.example1;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IllegalStateException{
        try {
            something();

        }
        catch (NumberFormatException e) {
            System.out.println(e.toString());
            System.exit(0);
        }
        finally {
            System.out.println("I don't know if this will get printed out");
        }

        }
    static void something(){
        System.out.println("I dont know that i can write out!");
        int[] arr = new int[5];
        for (int j = 0; j < 5; j++) {
//            if (j == 1) break;
            System.out.println(arr[j+1]);
        }
    }

}
