package lessons.alishevCourse.forContinuers.lesson4.linkedList;


import java.util.Arrays;

public class MyLinkedList implements CollectionList{
    private Node head;
    private int size;
    private MyLinkedList tmpList;


    @Override
    public int size() {
        return size;
    }
    @Override
    public void remove (int index) {
        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }
        int currentIndex = 0;
        Node tmp = head;
        while (tmp != null){
            if (currentIndex == (index - 1) ){
                tmp.setNext(tmp.getNext().getNext());
                size--;
                return;
            } else {
                tmp = tmp.getNext();
                currentIndex++;
            }

        }
        throw new IllegalArgumentException();
    }

    @Override
    public void add(int value){
        // Если это первое добовление в список
        if(head == null){
            this.head = new Node(value);
        } else {
            Node tmp = head;
            while (tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(value));
        }
//            То здесь будет какая-то логика
        size++;
    }
    @Override
    public void add(int index, int value) {

        int currentIndex = 0;
        if (head == null && index == 0) {
            this.head = new Node(value);
            size++;
            return;
        } else if(head != null && index == 0) {
            Node tmpNode = new Node(value);
            tmpNode.setNext(head);
            head = tmpNode;
            size++;
            return;
        } else {
            Node tmp = head;
            while (tmp != null) {
                if (currentIndex  == index -1) {
                    size++;
                    Node tmpNode = new Node(value);
                    tmpNode.setNext(tmp.getNext());
                    tmp.setNext(tmpNode);

                    return;
                }
                tmp = tmp.getNext();
                currentIndex++;
            }
            throw new IllegalArgumentException();
        }
    }


    @Override
    public int get(int index){
        int currentIndex = 0;
        Node tmp = head;
        while (tmp != null){
            if (currentIndex == index){
                return tmp.getValue();
            }
            tmp = tmp.getNext();
            currentIndex++;
        }
        throw new IllegalArgumentException();
    }


    @Override
    public String toString() {
        int[] result = new int[size];

        int index = 0;
        Node tmp = head;
        while (tmp != null){
            result[index++] = tmp.getValue();
            tmp = tmp.getNext();
        }
        return Arrays.toString(result);
    }



    private static class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
