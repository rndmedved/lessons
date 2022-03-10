package lessons.string;

import java.util.StringJoiner;
/*
Соединяет строки по разделителю.
П.С. В конце не остается разделителя.
 */

public class StringJoinerClass {
    public static void main(String[] args) {
        String s1 = "Hello,";
        String s2 = "World!";
        StringJoiner stringJoiner = new StringJoiner(" ");
        stringJoiner.add(s1);
        stringJoiner.add(s2);
        System.out.println(stringJoiner);
    }
}
