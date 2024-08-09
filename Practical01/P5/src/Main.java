import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the product code: ");
        int productCode = scanner.nextInt();

        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();

        double taxRate = 0.0;

        switch (productCode) {
            case 1:
                taxRate = 0.08;
                break;
            case 2:
                taxRate = 0.12;
                break;
            case 3:
                taxRate = 0.05;
                break;
            case 4:
                taxRate = 0.075;
                break;
            default:
                taxRate = 0.03;
                break;
        }

        double priceWithTax = price + (price * taxRate);

        System.out.printf("Product Code: %d, Price: %.2f, Tax Rate: %.2f%%, Price with Tax: %.2f%n",
                productCode, price, taxRate * 100, priceWithTax);

        scanner.close();

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");

    }
}
