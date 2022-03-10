package lessons.InputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputReader {
    public static void main(String[] args) throws IOException {


        File file = new File("/home/medved/createdFile.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);

        String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!";

        fileOutputStream.write(greetings.getBytes());

        fileOutputStream.close();
    }
}
