package lessons.alishevCourse.forContinuers.lesson4.linkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        CollectionList myLinkedList = new MyLinkedList();
        myLinkedList.add(0, 1);
        myLinkedList.add(1, 2);
        myLinkedList.add(2, 3);
        myLinkedList.add(0, 4);
        myLinkedList.remove(3);
        myLinkedList.add(0, 123123);
        myLinkedList.add(myLinkedList.size(), Integer.MAX_VALUE);
//        myLinkedList.add(3, 5);
//        myLinkedList.add(10);
//        myLinkedList.add(1983);
//        myLinkedList.add(5);
        System.out.println(myLinkedList.size());
//        myLinkedList.add(1,8);




        System.out.println("LinkedList: "+ myLinkedList);




    }
}
