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
//        Thread thread1 = new Thread(() -> {
//            try {
//                produce();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            try {
//                consumer();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

}
class ProducerConsumer{
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private Object lock = new Object();

    private void produce() throws InterruptedException {
        while (true){
            synchronized (lock){

            }
        }
    }

    private void consumer() throws InterruptedException {

    }
}
