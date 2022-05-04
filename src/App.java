import java.util.Scanner;

public class App {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Check if the word is palindrome!");
        System.out.print("What's the word/sentence you would like to check?: ");
        String word = scan.nextLine();
        word = word.toLowerCase();
        word = word.replaceAll("\\s+", "");

        String checkAgainst = word.toLowerCase();
        checkAgainst = checkAgainst.replaceAll("\\s+", "");
        checkAgainst = new StringBuilder(checkAgainst).reverse().toString();

        // If we go the array route:
        // String checkAgainstWord = "";
        // for (int i = checkAgainst.length() - 1; i >= 0; i--) {
        // checkAgainstWord = checkAgainstWord + checkAgainst.charAt(i);
        // }

        if (word.equals(checkAgainst)) {
            System.out.println("That word is a palindrome!");
        } else {
            System.out.println("Nope, that word is NOT a palindrome!");
        }
    }
}
