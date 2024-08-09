interface P1 {
    int CONSTANT_P1 = 10;
    void methodP1();
}

interface P2 {
    String CONSTANT_P2 = "Hello";
    void methodP2();
}

interface P12 extends P1, P2 {
}

class Q implements P12 {
    @Override
    public void methodP1() {
        System.out.println("Method P1 called. Constant P1: " + CONSTANT_P1);
    }

    @Override
    public void methodP2() {
        System.out.println("Method P2 called. Constant P2: " + CONSTANT_P2);
    }
}

public class Main {
    public static void main(String[] args) {
        Q obj = new Q();
        obj.methodP1();
        obj.methodP2();
        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }
}