package lessons.alishevCourse.forContinuers.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        testMap(hashMap);
        System.out.println();
        testMap(treeMap);
        System.out.println();
        testMap(linkedHashMap);
    }

    public static void testMap(Map<Integer,String> map){
        map.put(1, "Вероника");
        map.put(2, "Оля");
        map.put(14, "Ted");
        map.put(13, "Mike");
        map.put(4, "Коля");
        map.put(3, "Миша");

        System.out.println(map);
    }

}
