package lessons.stepik.modul2.task4.ex2;

public class Solution {


    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 5, 12, 15, 123, 344};
        int[] array2 = {0, 1, 3, 4, 6, 8, 12, 13};
        int[] resultArray = mergeArrays(array1, array2);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]+" ");
        }
        System.out.println();
        System.out.println(array1.length);
        System.out.println(array2.length);
        System.out.println(resultArray.length);
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length+a2.length];
        int a1index = 0;
        int a2index = 0;
        while (a1index < a1.length && a2index < a2.length){
            if (a1[a1index] > a2[a2index]){
                result[a1index + a2index] = a2[a2index];
                a2index++;
            } else {
                result[a1index + a2index] = a1[a1index];
                a1index++;
            }
        }
        for (int i = a1index; i < a1.length; i++) {
            result[a2index + i] = a1[i];
        }
        for (int i = a2index; i < a2.length ; i++) {
            result[a1index + i] = a2[i];
        }
        return result;
    }
}
