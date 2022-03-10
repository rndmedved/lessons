package lessons.testObject.animals;

public class Cat extends Animals {

    public Cat(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Cats{" +
                "id=" + id +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
