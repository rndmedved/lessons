package lessons.stepik.modul2.task2.ex1;

public class Solution {
    public static void main(String[] args) {
        System.out.println(charExpression(29));
    }



    public static char charExpression(int a) {
        char startChar = '\\';
        int c = startChar;
        char result = (char) (c + a);
        return result;
    }

}
