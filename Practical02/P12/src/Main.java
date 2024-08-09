import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Length of the string: " + input.length());

        System.out.println("Lowercase: " + input.toLowerCase());

        System.out.println("Uppercase: " + input.toUpperCase());

        StringBuilder reversed = new StringBuilder(input).reverse();
        System.out.println("Reversed: " + reversed);

        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        String sorted = new String(charArray);
        System.out.println("Sorted: " + sorted);

        scanner.close();

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }
}