public class Main {
    public static void main(String[] args) {
        String originalString = "CHARUSAT University";

        int length = originalString.length();
        System.out.println("Length of the string: " + length);

        String replacedString = originalString.replace('H', 'N');
        System.out.println("String after replacing 'H' with 'N': " + replacedString);

        String uppercaseString = originalString.toUpperCase();
        System.out.println("String in uppercase: " + uppercaseString);

        String extractedString = originalString.substring(0, 8);
        System.out.println("Extracted 'CHARUSAT': " + extractedString);

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }
}