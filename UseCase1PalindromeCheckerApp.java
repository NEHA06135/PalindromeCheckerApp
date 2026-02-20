/**
 * ============================================================
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * ============================================================
 *
 * UC1: Welcome Message
 * UC2: Hardcoded Palindrome (Half Comparison)
 * UC3: Reverse String Based Palindrome Check
 *
 * @version 3.0
 */

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {

        // =========================
        // UC1 - Welcome Message
        // =========================
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("----------------------------------");

        // Hardcoded input
        String input = "madam";

        // =========================
        // UC2 - Half Comparison Method
        // =========================
        boolean isPalindromeUC2 = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindromeUC2 = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("UC2 - Is it a Palindrome? : " + isPalindromeUC2);

        // =========================
        // UC3 - Reverse String Method
        // =========================
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        boolean isPalindromeUC3 = input.equals(reversed);

        System.out.println("UC3 - Reversed text: " + reversed);
        System.out.println("UC3 - Is it a Palindrome? : " + isPalindromeUC3);

        System.out.println("----------------------------------");
        System.out.println("Program Completed");
    }
}