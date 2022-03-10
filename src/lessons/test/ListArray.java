package lessons.test;

import java.util.ArrayList;
import java.util.List;

public class ListArray {
    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("123     это одна строка");
        list.add("23      Это вторая строка");
        list.add("34556756Это третья строка");
//        for(String s : list){
//            if (s.equals("Это вторая строка"));
//            list.r(1);
//        }

        String id = "23";
        list.removeIf(s ->((s = s.substring(0, 8).trim()).equals(id)));
        list.set(1 , "Теперь третья строка без ID");
        for(String s: list){
            System.out.println(s);
        }
    }
}
