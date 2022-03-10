package lessons.alishevCourse.forContinuers.multithreading.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ContinueSynchronized {
    public static void main(String[] args) {
        new Worker().main();
    }
}

class Worker{
    Random random = new Random();
// Здесь создаются объекты, которые будут управлять очередностью потоков.
    Object lock1 = new Object();
    Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
// Если один поток занял этот метод, то другой не может его занять,
// однако он может исопльзовать парарллельно второй метод.
    public void addToList1(){
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addToList2(){
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void work(){
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main(){
        long before = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> {
            work();
        });
        Thread thread2 = new Thread(() -> {
            work();
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long after = System.currentTimeMillis();
        System.out.printf("Program took %d ms to run\n", after - before);
        System.out.println(list1.size());
        System.out.println("****************************************************************");
        System.out.println(list2.size());
    }
}
