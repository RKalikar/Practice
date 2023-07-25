//12.1
class ExampleClass {
    private int number;
    private String text;

    // Default constructor
    public ExampleClass() {
        this.number = 0;
        this.text = "Default";
    }

    // One argument constructor
    public ExampleClass(int number) {
        this.number = number;
        this.text = "Single Argument";
    }

    // Two argument constructor
    public ExampleClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void printFields() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }
}

public class Main {
    public static void main(String[] args) {
        ExampleClass obj1 = new ExampleClass();
        obj1.printFields();

        ExampleClass obj2 = new ExampleClass(10);
        obj2.printFields();

        ExampleClass obj3 = new ExampleClass(5, "Hello");
        obj3.printFields();
    }
}
