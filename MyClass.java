public class MyClass {
    private int number;
    private String text;

    public MyClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public void printFields() {
        System.out.println("Number: " + this.number);
        System.out.println("Text: " + this.text);
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass(42, "Hello, World!");
        myObj.printFields();
    }
}
