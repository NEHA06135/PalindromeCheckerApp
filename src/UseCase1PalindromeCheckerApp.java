/**
 * ============================================================
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * ============================================================
 *
 * UC1: Welcome Message
 * UC2: Hardcoded Palindrome Validation
 *
 * @version 2.0
 */

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        // =========================
        // UC1 - Welcome Message
        // =========================
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("----------------------------------");

        // =========================
        // UC2 - Hardcoded Palindrome
        // =========================
        String input = "madam";

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Required Output Format
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        System.out.println("----------------------------------");
        System.out.println("Program Completed");
    }
}
