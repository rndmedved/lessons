package lessons.alishevCourse.forContinuers.lambdaExpression.lesson1.lambda3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorRealization {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("word1");
        list.add("sortedWord");
        list.add("finally hello!");
        list.add("at the end goodbye!");
        list.add("a");
        list.add("short");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.length()-t1.length();
            }
        });
        System.out.println(list);

        list.sort((s1, s2) -> s2.length() - s1.length());
        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }
}
