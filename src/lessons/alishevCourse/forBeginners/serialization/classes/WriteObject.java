package lessons.alishevCourse.forBeginners.serialization.classes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(0, "Ivan");
        Person person2 = new Person(1, "Aleksey");
        Person[] peoples = {person1, person2, new Person(2, "Olga")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(peoples); //Запись всего массива объектов как объект




            /*
            ******* Это запись сериализации каждого объекта в отдельности. ********
            oos.writeInt(peoples.length);
            for(Person p : peoples){
                oos.writeObject(p);
            }
            */


            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
