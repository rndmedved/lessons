package lessons.InputOutput;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegular {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
        System.out.println(isPalindrome("Text at xet!"));
        System.out.println(isPalindrome("Panda"));
    }


    public static boolean isPalindrome(String text) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(text);
        String str = matcher.replaceAll("").toLowerCase(Locale.ROOT);
        String resultStr = new StringBuilder(str).reverse().toString();
        return str.equals(resultStr); // your implementation here
    }
}
