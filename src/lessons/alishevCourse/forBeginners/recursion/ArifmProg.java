package lessons.alishevCourse.forBeginners.recursion;

public class ArifmProg {
    public static void main(String[] args) {
        System.out.println(progression(1, 3, 10));
    }
    public static int progression(int firstTerm, int step, int maxTerm){

        if ((firstTerm + step ) > maxTerm) return firstTerm;
        return firstTerm + progression(firstTerm + step, step, maxTerm);
    }
}
