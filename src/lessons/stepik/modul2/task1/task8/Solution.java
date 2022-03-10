package lessons.stepik.modul2.task1.task8;

public class Solution {
    public static void main(String[] args) {
        System.out.println(leapYearCount(1));
        System.out.println(leapYearCount(4));
        System.out.println(leapYearCount(100));
        System.out.println(leapYearCount(1000));
        System.out.println(leapYearCount(2020));
    }



    public static int leapYearCount(int year) {
        return year/4 - year / 100 + year / 400 ;
    }
}
