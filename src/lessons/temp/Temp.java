package lessons.temp;

public class Temp {
    public static void main(String[] args) {
        sayHello(100);
    }
    public static void sayHello(int iterator){
        System.out.printf("I said hello %d times.\n", iterator);
        if(iterator == 1) return;
        sayHello(iterator - 1);
    }
}
