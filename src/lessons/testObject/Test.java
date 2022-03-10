package lessons.testObject;

import lessons.testObject.animals.Cat;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(1);
        Cat cat1 = new Cat(2);
        System.out.println(cat.toString());

        cat.setId(3);
        System.out.println(cat.toString());
    }

}


