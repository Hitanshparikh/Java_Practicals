// Return Object Example
class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }
}

public class Main {

    public static void main(String[] args) {
        Rectangle rect = createRectangle(6, 9);
        System.out.println("Area of the rectangle: " + rect.calculateArea());

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }

    public static Rectangle createRectangle(int length, int width) {
        return new Rectangle(length, width);
    }
}
