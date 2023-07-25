#11.3
public class ConstructorThis {
    private int number;
    private String text;

    public ConstructorThis() {
        // Call the parameterized constructor with default values
        this(0, "Default");
    }

    public ConstructorThis(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void printFields() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        ConstructorThis obj1 = new ConstructorThis();
        obj1.printFields();

        ConstructorThis obj2 = new ConstructorThis(10, "Hello, World!");
        obj2.printFields();
    }
}
