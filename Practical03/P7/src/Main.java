// Pass By Value Example
public class Main {

    public static void main(String[] args) {
        int a = 6;
        System.out.println("Before method call: a = " + a);

        increment(a);

        System.out.println("After method call: a = " + a);

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }

    public static void increment(int num) {
        num++;
        System.out.println("Inside method: num = " + num);
    }
}
