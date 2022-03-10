package lessons.alishevCourse.forBeginners.serialization.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadObject {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p;

            Person[] peoples = (Person[]) ois.readObject();

            /*
            ********** Считывание объектов по одному*****
            int personNumbers =  ois.readInt();
            for(int i = 0 ; i < personNumbers; i++){
                persons.add((Person) ois.readObject());
            }
            */
            System.out.println(Arrays.toString(peoples));
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
