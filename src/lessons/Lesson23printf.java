package lessons;

public class Lesson23printf {
    public static void main(String[] args) {
        System.out.printf("%d This is a string, %s", 1, "String pass.\n");
        for (int i = 1; i < 1001; i*=10) {
            System.out.printf("Test output number %-5d. This work nice\n", i);
        }
        for (int i = 1; i < 1001; i*=10) {
            System.out.printf("Test output number %5d. This work nice\n", i);
        }
        System.out.printf("String %.2f\n", 2.0/3.0);
        System.out.printf("String %.2f\n", 12341234.0/2342341.0);
        System.out.printf("String %.2f\n", 4.0f);
    }
}
