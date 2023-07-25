//11.1
public class NoThis {
    private int field1;
    private String field2;
    private double field3;

    public NoThis(int field1, String field2, double field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public void printFields() {
        System.out.println("field1: " + this.field1);
        System.out.println("field2: " + this.field2);
        System.out.println("field3: " + this.field3);
    }

    public static void main(String[] args) {
        NoThis myObject = new NoThis(10, "Hello", 3.14);
        myObject.printFields();
    }
}
