package lessons.temp;

public class Temp {
    public static void main(String[] args) {
        sayHello(1);
        String s = "Hello";
        System.out.println(testString(s));
    }
    public static void sayHello(int iterator){
        System.out.printf("I said hello %d times.\n", iterator);
        if(iterator == 1) return;
        sayHello(iterator - 1);
    }
    public static boolean testString(String st){
        String string = "Something test string! Hello!";
        return string.contains(st);
    }
}
