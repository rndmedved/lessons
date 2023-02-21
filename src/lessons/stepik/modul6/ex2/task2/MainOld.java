package lessons.stepik.modul6.ex2.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MainOld {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> iOut = new ArrayList<>();
            if (reader.ready()) {
                String s = reader.readLine();
                String[] tmp = s.split(" ");
                int i = 0;
                for (String s1 : tmp) {
                    if (i % 2 == 1) {
                        iOut.add(Integer.parseInt(s1));
                    }
                    i++;
                }
            }
            Collections.reverse(iOut);
            for (Integer integer : iOut) {
                System.out.print(integer + "\t");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ввести нужно именно число!");
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
