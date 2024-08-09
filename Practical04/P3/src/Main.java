public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Rectangle(5, 4);
        shapes[1] = new Square(5);
        shapes[2] = new Rectangle(7, 3);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + ":");
            shapes[i].printArea();
            shapes[i].printPerimeter();
            System.out.println();
        }

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }
}

class Rectangle implements Shape {
    protected double length;
    protected double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        double area = length * breadth;
        System.out.println("Area: " + area);
    }

    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

interface Shape {
    void printArea();
    void printPerimeter();
}