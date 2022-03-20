package lessons.alishevCourse.forContinuers.multithreading.lesson7;

import lessons.singleton.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorServices = Executors.newFixedThreadPool(200);
        Connection connection = Connection.getConnection();
        for (int i = 0 ; i< 200; i++){
            executorServices.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        executorServices.shutdown();
        executorServices.awaitTermination(1, TimeUnit.DAYS);

    }
}
class Connection{
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);

    private Connection(){

    }
    public static Connection getConnection(){
        return connection;
    }
    public void work() throws InterruptedException{
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }
    private void doWork() throws InterruptedException {
        synchronized (this){
            connectionsCount++;
        }
        System.out.println(connectionsCount);
        Thread.sleep(1000);
        synchronized (this){
            connectionsCount--;
        }


    }

}
