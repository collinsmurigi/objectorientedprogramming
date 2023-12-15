// Object Example
public class ObjectExample {
    private String name;

    public ObjectExample(String n) {
        this.name = n;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Creating an object
        ObjectExample obj = new ObjectExample("John");
        obj.displayName();
    }
}
