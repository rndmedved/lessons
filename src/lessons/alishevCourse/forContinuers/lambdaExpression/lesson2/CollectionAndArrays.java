package lessons.alishevCourse.forContinuers.lambdaExpression.lesson2;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CollectionAndArrays {
    public static void main(String[] args) {
//        old methods:
//        для лямбды нет разницы массив или лист
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();
        CollectionAndArrays cs = new CollectionAndArrays();
        cs.fillArr(arr1);
        cs.fillList(list1);


        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);
        System.out.println("*********************************************");

        for (int i = 0; i < 10; i++){
            arr1[i] = arr1[i] * 2;
            list1.set(i, list1.get(i) * 2);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);
        System.out.println("*********************************************");
        System.out.println("Use method map!");

//        same things with lambda
        AtomicInteger i = new AtomicInteger();
        arr1 = Arrays.stream(arr1).map(a -> i.getAndIncrement()).toArray(); // превращаем массив в поток // еще я добавил инкрементацию в map
        list1 = list1.stream().map(a -> a * 3).collect(Collectors.toList()); // и обратно из потока возвращаем лист и массив
        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);
        System.out.println("*********************************************");
// Метод фильтр.

        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();
        cs.fillArr(arr2);
        cs.fillList(list2);

        int[] testArr = Arrays.stream(arr2).filter(a -> (a % 2) == 0).toArray();
        list2 = list2.stream().filter(a -> (a % 2) == 1).collect(Collectors.toList());
        System.out.println(Arrays.toString(testArr));
        System.out.println(list2);
        System.out.println("*********************************************");
//        Метод foreach То же что и foreach
        Arrays.stream(arr2).forEach(a -> System.out.print(a + " "));
        System.out.println();
        list2.stream().forEach(System.out::print);
        System.out.println();
        System.out.println("*********************************************");
//      reduce - уменьшение до одного элемента.
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        cs.fillArr(arr3);
        cs.fillList(list3);

        int arrSum = Arrays.stream(arr3).reduce((a, b) -> a + b).getAsInt();// a - счетчик, b - текущий элемент.

        int arrSum2 = Arrays.stream(arr3).reduce(0, (a, b) -> a + b);// указано начальное значение аккумулятора.

        System.out.println(list3.stream().reduce((a, b) -> a + b).get());
        System.out.println(arrSum2);
        System.out.println(arrSum);

        System.out.println("*********************************************");
//        Методы можно вызывать один за другим.

        int[] arr4 = new int[10];
        cs.fillArr(arr4);
        System.out.println(Arrays.toString(arr4));
        System.out.println((Arrays.stream(arr4).filter(a -> (a % 2) == 1).map(a -> a * 2).reduce((a, b) -> a + b).getAsInt()));

        System.out.println("*********************************************");
//        эти методы работают и на другие коллекции тоже
        Set<Integer> set = new HashSet<>();
        for (int j = 0; j < 10; j++) {
            set.add(j);
        }
        set = set.stream().map(a -> a * 2).collect(Collectors.toSet());
        System.out.println(set);




    }

    private void fillArr(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }
    private void  fillList(List list){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
    }
}
