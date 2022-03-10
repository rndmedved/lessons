package lessons.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
//        properties.setProperty("one", "1");
//        System.out.println(properties.getProperty("one"));
//        FileOutputStream out = new FileOutputStream("file.properties");
//        properties.store(out, "My comments");
        FileInputStream fis = new FileInputStream("file.properties");
        properties.load(fis);
        Map<String, String> propMap = new HashMap<>();
//        propMap.put(properties) = properties
        System.out.println(properties.getProperty("one two three"));
    }
}
