import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;
// UC12: Define PalindromeStrategy interface
interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

// UC12: Implement StackStrategy
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String original) {
        String cleanInput = original.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : cleanInput.toCharArray()) stack.push(c);

        for (char c : cleanInput.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

// UC12: Implement DequeStrategy
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String original) {
        String cleanInput = original.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : cleanInput.toCharArray()) deque.addLast(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}
        // UC12 Logic: Inject strategy at runtime
// Try swapping "new StackStrategy()" with "new DequeStrategy()"!
        PalindromeStrategy strategy = new StackStrategy();

        // Call the method defined by the interface (Polymorphism in action!)
        boolean isPalindrome = strategy.checkPalindrome(original);

// Print result
if (isPalindrome) {
        System.out.println("Result: Success! '" + original + "' is a palindrome.");
} else {
        System.out.println("Result: Fail! '" + original + "' is NOT a palindrome.");
}