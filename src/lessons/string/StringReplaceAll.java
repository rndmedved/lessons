package lessons.string;

public class StringReplaceAll {
    public static void main(String[] args) {
        String number = "1234j123h123g1234fg5ug)(as223423412";
        System.out.println(number.replaceAll("[^0-9]+", "").trim());
    }
}
