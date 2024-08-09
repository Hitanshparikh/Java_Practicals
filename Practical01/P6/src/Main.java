import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        String reversedNumber = "";
        int index = number.length() - 1;

        while (index >= 0) {
            reversedNumber += number.charAt(index);
            index--;
        }

        System.out.println("Reversed Number: " + reversedNumber);

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");

    }
}
