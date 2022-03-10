package lessons.InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerReadInt {
    public static void main(String[] args) {
        String separator = File.separator;      //separator - разделитель для определенной ОС
        String path = separator + "home" + separator + "medved" + separator + "read.txt";

        File file = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String line = scanner.nextLine();
        scanner.close();
        String[] numbers = line.split(" ");
        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }
        System.out.println(Arrays.stream(intNumbers).sum());
        System.out.println(Arrays.stream(intNumbers).max());
        System.out.println(Arrays.stream(intNumbers).min());
        System.out.println(Arrays.stream(intNumbers).sorted());

    }
}
