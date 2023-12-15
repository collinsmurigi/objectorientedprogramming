// Class Example
public class ClassExample {
    private int number;

    public void setNumber(int num) {
        this.number = num;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        ClassExample obj = new ClassExample();
        obj.setNumber(25);
        System.out.println("Number: " + obj.getNumber());
    }
}
