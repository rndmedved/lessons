package lessons.mapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapClass {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            Integer rnd = (int) Math.round(Math.random() * 10);
            if (map.containsKey(rnd)) {
                int value = map.get(rnd);
                value++;
                map.put(rnd, value);
            } else map.put(rnd, 1);
        }
        for (Map.Entry<Integer, Integer> elements : map.entrySet()){
            System.out.println(elements.getKey() + " "+ elements.getValue());
        }

    }
}
