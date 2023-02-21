package lessons.stepik.modul4.ex1.task7;

public class StackTraceElementTest {
    public static void main(String[] args)
    {
        method1();
    }

    public static void method1()
    {
        method2();
    }

    public static void method2()
    {
        method3();
    }

    public static void method3()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement[] stack2 = new Exception().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
        for (StackTraceElement stack : stack2){
            System.out.println(stack.getClassName()+ "\t" + stack.getMethodName());
        }
    }
}
