package lessons.alishevCourse.forContinuers.lambdaExpression.lesson1.lambda2;


interface Executable{
    void execute();
}

class Runner{
    public void run(Executable executable){
        executable.execute();
    }
}
class ExecutableImplementation implements Executable{

    @Override
    public void execute() {
        System.out.println("Здесь реализация какой-то логики первым способом!");
    }
}

public class Lambda2 {
    //    Лямбда выражения позволяют использовать анонимные метод без их объявления
//    Анонимный метод - это метод без названия.
    public static void main(String[] args) {
        Runner runner = new Runner();
//        Существует 3 способа реализации интерфейса.
//        Первый способ - реализовать отдельный класс
        runner.run(new ExecutableImplementation());
//        Второй способ через анонимный класс
        runner.run(new Executable() {
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
