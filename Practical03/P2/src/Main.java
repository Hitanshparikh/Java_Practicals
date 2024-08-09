public class Main
{
    public static void main(String[] args) {
        TriangleArea t1 = new TriangleArea();
        TriangleArea t2 = new TriangleArea(3);
        TriangleArea t3 = new TriangleArea(5, 6);

        System.out.println(t1.area);
        System.out.println(t2.area);
        System.out.println(t3.area);

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }
}

class TriangleArea {
    double area;

    TriangleArea() {
        area = 15;
    }

    TriangleArea(double r) {
        area = 3.14 * r * r;
    }

    TriangleArea(float b, float h) {
        area = 0.5 * b * h;
    }
}