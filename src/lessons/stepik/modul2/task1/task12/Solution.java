package lessons.stepik.modul2.task1.task12;

public class Solution {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.2, 0.3));
    }
    public static boolean doubleExpression(double a, double b, double c) {
        double error = 1E-4;
        return Math.abs((a + b) - c) < error;
    }
}
