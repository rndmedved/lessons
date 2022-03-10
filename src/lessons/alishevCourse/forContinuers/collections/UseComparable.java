package lessons.alishevCourse.forContinuers.collections;

import lessons.alishevCourse.forBeginners.serialization.classes.Person;

import java.util.*;

public class UseComparable {
    /* В классе Person пакета lessons.alishevCourse.forBeginners.serialization.classes
    я отдельно содал Comparable<T> с реализацией метода compareTo(T t){}

     */
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();
        addElements(personList);
        addElements(personSet);
//        ********* Компоратор многоразового использования с отдельным классом *****
        Collections.sort(personList, new PersonClassComparator());
        System.out.println(personList);
        System.out.println(personSet);
//        ******* Компоратор по длине имени создаем анонимный класс*********
        System.out.println("************************************************");
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                if(person.getName().length() > t1.getName().length()) return 1;
                if (person.getName().length() < t1.getName().length()) return -1;
                return 0;
            }
        });
        System.out.println(personList);
        System.out.println("************************************************");
//        ******* Компоратор по Id, используя Лямбда выражение *********
        Collections.sort(personList, (person1, person2) -> person1.getId() - person2.getId());
        System.out.println(personList);


    }
    public static void addElements(Collection collection){
        collection.add(new Person(1, "Tom"));
        collection.add(new Person(4, "Helga"));
        collection.add(new Person(3, "Mike"));
        collection.add(new Person(2, "Ted"));
    }
}
class PersonClassComparator implements Comparator<Person>{
//*********** Компоратор по алфавитному порядку
    @Override
    public int compare(Person a, Person b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}
