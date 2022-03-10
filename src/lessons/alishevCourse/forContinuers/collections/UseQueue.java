package lessons.alishevCourse.forContinuers.collections;

import lessons.alishevCourse.forBeginners.serialization.classes.Person;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<Person> people = new LinkedList<>();
        people.add(new Person(1, "Tom"));
        people.add(new Person(4, "Helga"));
        people.add(new Person(3, "Mike"));
        people.add(new Person(2, "Ted"));
        System.out.println(people);
    }


}
