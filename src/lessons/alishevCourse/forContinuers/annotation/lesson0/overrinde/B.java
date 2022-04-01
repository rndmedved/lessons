package lessons.alishevCourse.forContinuers.annotation.lesson0.overrinde;

public class B extends A{
//     не дает менять название метода в родительском классе без изменения в классе потомке.
    @Override
    public void test(){
        System.out.println("Hello from class B!");
    }
}
