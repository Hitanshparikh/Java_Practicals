import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1 = scanner.nextDouble();

        Complex complex1 = new Complex(real1, imaginary1);

        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2 = scanner.nextDouble();

        Complex complex2 = new Complex(real2, imaginary2);

        System.out.println("Complex Number 1:");
        complex1.display();

        System.out.println("Complex Number 2:");
        complex2.display();

        System.out.println("Sum:");
        Complex sum = complex1.add(complex2);
        sum.display();

        System.out.println("Difference:");
        Complex difference = complex1.subtract(complex2);
        difference.display();

        System.out.println("Product:");
        Complex product = complex1.multiply(complex2);
        product.display();

        scanner.close();

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }
}
