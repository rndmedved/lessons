package lessons.stepik.modul6.ex2.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> iOut = new ArrayList<>();
        int i = 0;
        while (scanner.hasNextInt()) {
            if (i % 2 == 1) {
                iOut.add(scanner.nextInt());
            } else {
                scanner.nextInt();
            }
            i++;
        }
        Collections.reverse(iOut);
        for (Integer integer : iOut) {
            System.out.print(integer + " ");
        }

    }
}
