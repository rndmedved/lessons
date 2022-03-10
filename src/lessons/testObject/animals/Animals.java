package lessons.testObject.animals;

public class Animals {
    protected int id;
    public void run(){}
    public void sleep () {}
    public Animals (int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
