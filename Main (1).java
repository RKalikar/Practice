class ParentClass {
    protected int parentField;

    public ParentClass(int parentField) {
        this.parentField = parentField;
    }
}

class ChildClass extends ParentClass {
    private int childField;

    public ChildClass(int parentField, int childField) {
        super(parentField);
        this.childField = childField;
    }

    public void printParentFields() {
        System.out.println("ParentField: " + super.parentField);
    }

    public void printChildFields() {
        System.out.println("ChildField: " + this.childField);
    }
}

public class Main {
    public static void main(String[] args) {
        ChildClass childObj = new ChildClass(10, 5);
        childObj.printParentFields();
        childObj.printChildFields();
    }
}
