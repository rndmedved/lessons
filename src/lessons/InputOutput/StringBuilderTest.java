package lessons.InputOutput;

public class StringBuilderTest {
    public static void main(String[] args) {
        Leave leave = new Leave();
        leave.start();
        Night night = new Night();
        night.start();
        Sofa sofa = new Sofa();
        sofa.start();

    }
    public static class Leave extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Я уехал к Оле!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Night extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Меня дома не будет.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class  Sofa extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Можешь не стелиться!");
                System.out.println();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
