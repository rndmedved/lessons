package lessons.stepik.modul5.ex3.task2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double sum = 0;
        while (scanner.hasNext()){
            try{
                sum += scanner.nextDouble();
            }catch (InputMismatchException e){
                scanner.next();
            }
        }
        scanner.close();
        System.out.printf("%.6f", sum);
    }
}
