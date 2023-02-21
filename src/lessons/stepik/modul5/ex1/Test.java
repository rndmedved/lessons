package lessons.stepik.modul5.ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/medved/test/abra.bom";
        File file = new File(fileName);
        Path path = Paths.get(fileName);
        System.out.println(file);
        System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path.toFile());

        Files.newInputStream(path);
    }
}
