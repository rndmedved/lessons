package lessons;

public class Lesson24ClassObject {
    public static void main(String[] args) {
        Human h1 =  new Human();
        h1.setName("Miracle");
        h1.setAge(35);
        System.out.println(h1.toString());
    }

}
class Human{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ", " + age;
    }
}