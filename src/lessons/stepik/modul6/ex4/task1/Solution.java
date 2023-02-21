package lessons.stepik.modul6.ex4.task1;

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        pseudoRandomStream(1763).limit(17).mapToObj(x -> " " + x).forEach(System.out::print);;
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n*n)/10)%1000); // your implementation here
    }


}
