package lessons.stepik.modul4.ex1.task7;

public class Solution {
Class
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
            // ...

        return null;
    }
}
