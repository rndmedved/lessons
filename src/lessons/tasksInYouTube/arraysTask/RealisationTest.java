package lessons.tasksInYouTube.arraysTask;

import jdk.nashorn.internal.ir.SplitReturn;

import java.util.*;

public class RealisationTest {
    public static void main(String[] args) {
        int arrayLength = 100000;
        int[] array = sortedList(arrayLength);
        int k = array.length/3;
//        System.out.println(Arrays.toString(array));
        System.out.println(k);

        System.out.println("Тест перебора:");
        timeRealisation(new Realisation1(array, k));
        System.out.println("Test HashSet: ");
        timeRealisation(new RealisationWithHashSet(array, k));
        System.out.println("Test Sorted Array:");
        timeRealisation(new RealisationSortedArray(array, k));
        System.out.println("Test two point");
        timeRealisation(new RealisationWithTwoPointers(array, k));

    }
    public static int[] sortedList(int arrayLength){
        Random random = new Random();
        Set<Integer> array = new TreeSet<>();
        for (int i = 0; i < arrayLength; i++) {
            array.add(random.nextInt(2* arrayLength) - arrayLength);
        }
        int[] result = new int[array.size()];
        int i = 0;
        for(Integer n:array){
            result[i] = n;
            i++;
        }
        return result;
    }

    public static void timeRealisation(Realisation realisation){
        Long before = System.currentTimeMillis();
        System.out.println("Итоговый массив - " + Arrays.toString(realisation.findSum()));
        Long after = System.currentTimeMillis();
        System.out.println("Время выполнения программы - " + (after - before));

    }
}
class Realisation1 extends Realisation{
    private int[] array;
    private int k;

    public Realisation1(int[] array, int k) {
        this.array = array;
        this.k = k;
    }

    //    Реализация простым перебором. Долго и нудно.
    public int[] findSum(){
        for (int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++){
                if(array[i] + array[j] == k) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[0];
    }
}
class RealisationWithHashSet extends Realisation{
    private int[] array;
    private int k;

    public RealisationWithHashSet(int[] array, int k) {
        this.array = array;
        this.k = k;
    }

    public int[] findSum(){
        Set<Integer> set = new HashSet<>();
        for(Integer a: array){
            if (set.contains(k - a)) {
                return new int[]{a, k-a};
            } else {
                set.add(a);
            }
        }
        return new int[0];
    }
}

class RealisationSortedArray extends Realisation{
    private int[] array;
    private int k;
    // Воспользуемся бинарным поиском
//    Время работы O(n log n)
    //Память: O(1)

//[1, 2, 5, 7, 12, 14, 18, 19]
    public RealisationSortedArray(int[] array, int k) {
        this.array = array;
        this.k = k;
    }

    public int[] findSum(){
        for (int i = 0; i < array.length; i++) {
            int numberToFind = k - array[i];
            int l = i+1, r = array.length -1;
            while (l <= r){
                int mid = l + (r-l)/2;
                if (array[mid] == numberToFind){
                    return new int[]{array[i], array[mid]};
                }
                if(numberToFind < array[mid]){
                    r = mid -1;
                } else{
                    l = mid +1;
                }
            }
        }

        return new int[0];
    }
}

class RealisationWithTwoPointers extends Realisation{
    private int[] array;
    private int k;

//    Метод двух указателей
//    Время работы: O(n)
//    Память: O(1)


    public RealisationWithTwoPointers(int[] array, int k) {
        this.array = array;
        this.k = k;
    }

    public int[] findSum(){
        int l = 0; int r = array.length -1;
        while (l < r){
            int sum = array[l] + array[r];
            if (sum == k) {
                return new int[]{array[l], array[r]};
            } else if ( sum < k) {
                l++;
            } else {
                r--;
            }
        }
        return new int[0];
    }
}