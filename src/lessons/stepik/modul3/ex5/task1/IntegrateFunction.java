package lessons.stepik.modul3.ex5.task1;

import java.util.function.DoubleUnaryOperator;

public class IntegrateFunction {
    public static void main(String[] args) {
        System.out.println(integrate(x -> 2*x, 0, 10));
    }


    public static double integrate(DoubleUnaryOperator f, double a, double b){
        double i = a;
        double iterator = 1E-6;
        double result = 0;
        while (i < b){
            result = result + f.applyAsDouble(i)*(iterator);
            i+=iterator;
        }
        return result;
    }
}
