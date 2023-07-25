//9.2
abstract class AbstractClass {
    private int number;

    public AbstractClass(int number) {
        this.number = number;
    }

    // Non-abstract method
    public void nonAbstractMethod() {
        System.out.println("This is a non-abstract method.");
    }

    // Abstract method
    public abstract void abstractMethod();
}

// Subclass extending the abstract class
class Subclass extends AbstractClass {
    public Subclass(int number) {
        super(number);
    }

    // Implementing the abstract method from the abstract class
    @Override
    public void abstractMethod() {
        System.out.println("This is the implementation of the abstract method.");
    }
}

public class Main {
    public static void main(String[] args) {
        Subclass obj = new Subclass(10);

        obj.nonAbstractMethod(); 
        obj.abstractMethod();    
    }
}
