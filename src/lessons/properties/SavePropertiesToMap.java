package lessons.properties;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class SavePropertiesToMap {
    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        Properties out = new Properties();
        for(Map.Entry<String,String> map: runtimeStorage.entrySet()) {
            out.setProperty(map.getKey(), map.getValue());
        }
        out.store(outputStream, "I'll do it easy!");
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties in = new Properties();
        in.load(inputStream);
        for(String key : in.stringPropertyNames()){
            runtimeStorage.put(key, in.getProperty(key));
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}

