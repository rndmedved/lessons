package lessons.stepik.modul2.task4.test1;

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            if (i == 5) continue;
            System.out.println(i);
        }
        for (int i = 0; i < 10; ) {
            System.out.println(i);
//            if (i == 5) continue;
            i++;

        }

    }
    
    
}
