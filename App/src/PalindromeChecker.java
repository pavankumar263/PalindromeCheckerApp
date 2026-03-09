import java.util.Scanner;


public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker (UC3: String Reverse) ---");
        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();

        // Standardize input (Optional: handles case-sensitivity)
        String cleanInput = original.toLowerCase();
        String reversed = "";

        // UC3 Logic: Reverse string using a for-loop
        // We start from the last index (length - 1) and move to 0
        for (int i = cleanInput.length() - 1; i >= 0; i--) {
            // Note: In Java, this creates a new String object in every iteration
            reversed += cleanInput.charAt(i);
        }

        System.out.println("Original: " + cleanInput);
        System.out.println("Reversed: " + reversed);

        // UC3 Logic: Compare content using equals()
        if (cleanInput.equals(reversed)) {
            System.out.println("Result: Success! '" + original + "' is a palindrome.");
        } else {
            System.out.println("Result: Fail! '" + original + "' is NOT a palindrome.");
        }

        scanner.close();
    }
}