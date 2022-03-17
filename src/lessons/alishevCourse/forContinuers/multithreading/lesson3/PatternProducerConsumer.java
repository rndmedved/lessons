package lessons.alishevCourse.forContinuers.multithreading.lesson3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Паттерн производитель - потребитель.
public class PatternProducerConsumer {


    // Очередь потокобезопасна. И её размер не может вырасти больше указаного аргумента.
    // Если она заполняется, то ведет себя особым образом.
//    private static BlockingQueue<Integer> queue =  new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
       Thread thread1 = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                pc.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
class ProducerConsumer{
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true){
            synchronized (lock){
                while (queue.size() == LIMIT) {
                    lock.wait();
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }

    public void consumer() throws InterruptedException {
        while (true){
            synchronized (lock){
                while ((queue.size()) == 0){
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size is " + queue.size());
                lock.notify();
            }
            Thread.sleep(1000);
        }
    }


}
