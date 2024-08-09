class A {
    protected static int x = 10;
}

class B extends A {
    private int x = 20;

    public void display() {
        System.out.println("Static variable x in class A: " + A.x);
        System.out.println("Instance variable x in class B: " + this.x);
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }
}