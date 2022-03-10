package lessons.InputOutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInput {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("/home/medved/read.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);


        int i;

        while((i = bufferedInputStream.read())!= -1){

            System.out.print((char)i);
        }
    }
}
