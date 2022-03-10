package lessons.lesson34;

import java.util.ArrayList;
import java.util.List;
/*
        применение дженериков
*/


public class generic {
    public static void main(String[] args) {
        ///////////// до java 5 ////////////////
        List animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = animals.get(2).toString();
        System.out.println(animal);

        /////////////после java 5 ///////////////

        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        animal = animals2.get(1);

        ///////////// java 7 //////////////////
        List<String> animal3 = new ArrayList<>();
    }
}
