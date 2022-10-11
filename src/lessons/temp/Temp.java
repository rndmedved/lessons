package lessons.temp;

public class Temp {
    public static void main(String[] args) {
        sayHello(10);
        String s = "Hello";
        System.out.println(testString(s));
        int cx=0;
        switch (cx){
            case 0:
                System.out.println("zerro");
                break;
        }
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
