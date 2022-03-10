package lessons.alishevCourse.forContinuers.multithreading.lesson3;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Паттерн производитель - потребитель.
public class PatternProducerConsumer {
    // Очередь потокобезопасна. И её размер не может вырасти больше указаного аргумента.
    // Если она заполняется, то ведет себя особым образом.
    private static BlockingQueue<Integer> queue =  new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            try {
                produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                consumer();
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

    private static void produce() throws InterruptedException {
        Random random = new Random();
        while (true){
            queue.put(random.nextInt(100));
        }

    }

    private static void consumer() throws InterruptedException {
        Random random = new Random();
        while (true){
            Thread.sleep(100);
            if (random.nextInt(10) == 2) {
                System.out.println(queue.take());
                System.out.println("Queue size is " + queue.size());
            }
        }
    }
}
