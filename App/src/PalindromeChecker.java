import java.util.Deque;
import java.util.ArrayDeque;
// Standardize input
String cleanInput = original.toLowerCase();

        // UC7 Logic: Use Deque to compare front and rear elements
        Deque<Character> deque = new ArrayDeque<>();

// 1. Insert characters into deque
for (int i = 0; i < cleanInput.length(); i++) {
        deque.addLast(cleanInput.charAt(i));
        }

        boolean isPalindrome = true;

// 2 & 3. Remove first & last, compare until empty (or 1 element left)
while (deque.size() > 1) {
        char first = deque.removeFirst();
        char last = deque.removeLast();

    if (first != last) {
        isPalindrome = false;
        break; // Mismatch found, stop checking
        }
        }

// Print result
        if (isPalindrome) {
        System.out.println("Result: Success! '" + original + "' is a palindrome.");
} else {
        System.out.println("Result: Fail! '" + original + "' is NOT a palindrome.");
}