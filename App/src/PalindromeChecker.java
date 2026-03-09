import java.util.Stack;
// Standardize input
String cleanInput = original.toLowerCase();

        // UC5 Logic: Use stack to reverse characters and validate
        Stack<Character> stack = new Stack<>();

// 1. Push characters into stack
for (int i = 0; i < cleanInput.length(); i++) {
        stack.push(cleanInput.charAt(i));
        }

        boolean isPalindrome = true;

// 2. Pop and compare
for (int i = 0; i < cleanInput.length(); i++) {
        // Pop removes the top element (which is the last one added)
        if (cleanInput.charAt(i) != stack.pop()) {
        isPalindrome = false;
        break; // Mismatch found, stop checking
        }
        }

// 3. Print result
        if (isPalindrome) {
        System.out.println("Result: Success! '" + original + "' is a palindrome.");
} else {
        System.out.println("Result: Fail! '" + original + "' is NOT a palindrome.");
}