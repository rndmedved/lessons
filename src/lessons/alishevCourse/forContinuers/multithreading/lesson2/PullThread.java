package lessons.alishevCourse.forContinuers.multithreading.lesson2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PullThread {
    public static void main(String[] args) {
        // ExecutorService - пул потоков.
        // Перевод "сервис по исполнению потоков"
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 100; i++) {
            // Задается количество выполняемой работы каждому потоку.
            // Обязательно нужно передавать экземпляр класса, реаллизующий
            // интерфейс Runnable();
            executorService.submit(new Work(i));
        }
        //Метод shutdown() говорит выполнять те задания, которые
        // мы передали на выполнение
        executorService.shutdown();
        System.out.println("All tasks submitted");

        //Данный метод переводится как "Ожидаение окончания"
        //Указываем сколько ждать на выполнение всех заданий.
        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            System.out.println("Time away!");
        }
    }
}

class Work implements Runnable{
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work " + id +
                " was completed.");
    }
}
