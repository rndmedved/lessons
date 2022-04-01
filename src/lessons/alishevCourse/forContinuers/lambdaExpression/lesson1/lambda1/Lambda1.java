package lessons.alishevCourse.forContinuers.lambdaExpression.lesson1.lambda1;


interface Executable1{
    void execute();
}

class Runner1{
    public void run(Executable1 executable){
        executable.execute();
    }
}
class ExecutableImplementation1 implements Executable1{

    @Override
    public void execute() {
        System.out.println("Здесь реализация какой-то логики первым способом!");
    }
}

public class Lambda1 {
//    Лямбда выражения позволяют использовать анонимные метод без их объявления
//    Анонимный метод - это метод без названия.
    public static void main(String[] args) {
        Runner1 runner = new Runner1();
//        Существует 3 способа реализации интерфейса.
//        Первый способ - реализовать отдельный класс
        runner.run(new ExecutableImplementation1());
//        Второй способ через анонимный класс
        runner.run(new Executable1() {
            @Override
            public void execute() {
                System.out.println("Это второй способ реализации !");
            }
        });
//        Третий способ - используя лямбда выражение
        runner.run(() -> {
            System.out.println("Третий способ, где лямбду я осознанно написал сам впервые!");
        });
    }
}
