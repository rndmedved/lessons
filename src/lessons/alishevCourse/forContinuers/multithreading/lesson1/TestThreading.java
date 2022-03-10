package lessons.alishevCourse.forContinuers.multithreading.lesson1;

public class TestThreading {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");
        MyThread thread = new MyThread();
        MyThread thread1 = new MyThread();
        thread1.start();
        thread.start();
        Thread.sleep(100);
        thread.stop();
        thread1.stop();
        System.out.println("I stopped current thread");
    }
}
    class MyThread extends Thread{
    public int i;
        public void run(){
            while (true) {
                i++;
                System.out.printf("%s is  running.\n Счетчик получил значение %d\n", Thread.currentThread(),i);
            }
        }
}
