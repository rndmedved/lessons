package lessons.alishevCourse.forContinuers.annotation.lesson0.overrinde;

public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("Hello from main thread!");
    }
}

class MyThread extends Thread{
//    запрещает случайно изменить сигнатуру метода в методе run!

    @Override
    public void run(){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Hello from MyThread!");
    }
}
