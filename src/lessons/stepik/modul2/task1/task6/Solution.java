package lessons.stepik.modul2.task1.task6;

public class Solution {



    public static void main(String[] args) {
        System.out.println(booleanExpression(true, true, true, true));
        System.out.println(booleanExpression(false, true, true, true));
        System.out.println(booleanExpression(false, false, true, true));
        System.out.println(booleanExpression(false, true, false, true));
        System.out.println(booleanExpression(false, false, true, true));
        System.out.println(booleanExpression(false, false, true, false));
    }



    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int i = 0;
        if (a) i++;
        if (b) i++;
        if (c) i++;
        if (d) i++;
        return i == 2;
    }
}
