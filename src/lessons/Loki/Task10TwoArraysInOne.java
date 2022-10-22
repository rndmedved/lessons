package lessons.Loki;

import java.util.Arrays;

public class Task10TwoArraysInOne {
    public static void main(String[] args) {
        byte[] a = {1, 2, 7};
        byte[] b = {2, 4, 6};
        Task10TwoArraysInOne task10TwoArraysInOne = new Task10TwoArraysInOne();
        System.out.println(Arrays.toString(task10TwoArraysInOne.commit(a,b)));
    }


    byte[] commit(byte[] a, byte[] b){
        byte[] result = new byte[a.length + b.length];
        int i = 0;
        int j = 0;
        while (i + j < result.length){
            if (i == a.length){
                result[i+j] = b[j];
                j++;
            } else if (j == b.length){
                result[i+j] = a[i];
                i++;
            } else if (a[i] < b[j]){
                result[j+j] = a[i];
                i++;
            } else {
                result[i+j] = b[j];
                j++;
            }
        }
        return result;
    }
}
