interface Shape {
    String getColor();
    double getArea();

    default void printInfo() {
        System.out.println("This is a " + getColor() + " shape with area " + getArea());
    }
}

class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

// Sign class
class Sign {
    private Shape background;
    private String text;

    public Sign(Shape background, String text) {
        this.background = background;
        this.text = text;
    }

    public void displayInfo() {
        System.out.println("Sign Information:");
        background.printInfo();
        System.out.println("Text: " + text);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red");
        Rectangle rectangle = new Rectangle(4, 6, "Blue");

        Sign circleSign = new Sign(circle, "Welcome to the Math Department!");
        Sign rectangleSign = new Sign(rectangle, "Computer Science Lab");

        circleSign.displayInfo();
        System.out.println();
        rectangleSign.displayInfo();

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }
}