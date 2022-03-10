package lessons.alishevCourse.forBeginners.recursion;

public class Rec {
    public static void main(String[] args) {
        counter(5);
    }
//    counter(4)
//    counter(3)
//    counter(2)
//    counter(1)
//    counter(3)
//    counter(2)
//    counter(1)




    public static void counter(int n){
        System.out.println(n);
        n-=1;
        if (n==0) return;


        counter(n);

        if (n==1) return;
        counter(n);

    }
}
