package lessons.alishevCourse.forBeginners.serialization.classes;

import java.io.Serializable;

public class Person implements Serializable, Comparable<Person>{
    private int id;
    private String name;


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.id > o.getId()){
            return 1;
        }
        if (this.id < o.getId()){
            return -1;
        }
        return 0;
    }
}
