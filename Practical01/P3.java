public class P3 {
    public static void main(String[] args) {
        double a = 1234.5678;
        long b = (long) a;

        double c = a - b;
        short d = (short) (Math.floor(c * 10000));

        System.out.printf("Integral part: %.4f \n",a);
        System.out.printf("First four digits of the fractional part: %d", d);

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");

    }
}
