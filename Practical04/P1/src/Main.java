public class Main {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        parentObj.printParent();

        System.out.println();

        Child childObj = new Child();
        childObj.printChild();

        System.out.println();

        childObj.printParent();

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }
}

class Parent {
    public void printParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void printChild() {
        System.out.println("This is child class");
    }
}