package lessons.alishevCourse.forContinuers.multithreading.lesson2;

import javax.swing.plaf.IconUIResource;

public class TestSynchronized {
    private int counter;
    public static void main(String[] args){
        TestSynchronized ts = new TestSynchronized();
        try {
            ts.doWork();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//    ************** в данном методе используется синхронизированный блок, указывающий на объект синхронизации******
    private void increment(){
        synchronized (this){
            counter++;
        }
        System.out.println("Это  не синхронизированная часть кода "+ counter);
    }

    /* ************** Синхрониированный метод, используя ключевое слово synchronized*******************
    private synchronized void increment(){
        counter++;
    }
*/
    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}
