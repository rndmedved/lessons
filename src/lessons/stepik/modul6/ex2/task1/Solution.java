package lessons.stepik.modul6.ex2.task1;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1); set1.add(2); set1.add(3);
        set2.add(2); set2.add(3); set2.add(4);

        System.out.println(symmetricDifference(set1, set2));
    }
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> result = new HashSet<>();
        for(T value: set1){
            if (!set2.contains(value)){
                result.add(value);
            }
        }
        for(T value: set2){
            if (!set1.contains(value)){
                result.add(value);
            }
        }
        return result;
    }
}
