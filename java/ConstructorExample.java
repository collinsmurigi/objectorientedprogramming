// Constructor Method Example
public class ConstructorExample {
    private int value;

    // Constructor
    public ConstructorExample(int val) {
        this.value = val;
        System.out.println("Constructor called. Value set to: " + val);
    }

    public void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Creating an object and calling the constructor
        ConstructorExample obj = new ConstructorExample(10);
        obj.displayValue();
    }
}
