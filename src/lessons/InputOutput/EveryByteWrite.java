package lessons.InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EveryByteWrite {
    public static void main(String[] args) throws IOException {
//        FileOutputStream outputStream = new FileOutputStream("/home/medved/write1.txt");
        FileInputStream inputStream = new FileInputStream("/home/medved/write.txt");
        while (inputStream.available() > 0) {
            System.out.println(inputStream.read());
        }
    }
}
