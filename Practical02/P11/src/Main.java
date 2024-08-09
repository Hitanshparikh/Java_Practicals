public class Main {
    public static void main(String[] args) {
        String paragraph = "To be or not to be.";
        String reversedParagraph = reverseWordsInParagraph(paragraph);
        System.out.println("Original paragraph: " + paragraph);
        System.out.println("Reversed paragraph: " + reversedParagraph);

        System.out.println("This Practical is made by 23CS054 Hitansh Parikh");
    }

    public static String reverseWordsInParagraph(String paragraph) {
        String[] words = paragraph.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                if (Character.isLetterOrDigit(word.charAt(i))) {
                    reversedWord.insert(0, word.charAt(i));
                } else {
                    reversedWord.append(word.charAt(i));
                }
            }
            result.append(reversedWord).append(" ");
        }

        return result.toString().trim();
    }
}