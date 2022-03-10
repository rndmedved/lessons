package lessons.InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class InputReader {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("/home/medved/read.txt");

        int i;

        while((i=fileInputStream.read())!= -1){

            System.out.print(i + " ");
        }
    }
}
