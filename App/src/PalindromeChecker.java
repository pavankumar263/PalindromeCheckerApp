import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
// Standardize input
String cleanInput = original.toLowerCase();

        // UC6 Logic: Demonstrate FIFO vs LIFO
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

// 1 & 2. Push characters to stack and enqueue characters
for (int i = 0; i < cleanInput.length(); i++) {
        char c = cleanInput.charAt(i);
    stack.push(c);
    queue.add(c); // add() acts as enqueue in Java
}

        boolean isPalindrome = true;

// 3. Compare dequeue vs pop
while (!stack.isEmpty() && !queue.isEmpty()) {
        char popChar = stack.pop();        // LIFO: gets the last letter added
        char dequeueChar = queue.remove(); // FIFO: gets the first letter added

    if (popChar != dequeueChar) {
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