//10.5
// First interface with a common method
interface FirstInterface {
    void commonMethod();
}

// Second interface with the same common method signature
interface SecondInterface {
    void commonMethod();
}

// Class implementing both interfaces
class MyClass implements FirstInterface, SecondInterface {
    @Override
    public void commonMethod() {
        System.out.println("This is the implementation of the common method.");
    }
}

public class Interface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.commonMethod();
    }
}
