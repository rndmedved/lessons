package lessons;

public class Lesson23StringBuilder {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        System.out.println(sb.toString());
        sb.append(10);
        sb.append(" Strange string format.");
        System.out.printf(sb.toString()); //https://javarush.ru/groups/posts/1412-formatiruem-vihvod-chisel-v-java
    }
}
