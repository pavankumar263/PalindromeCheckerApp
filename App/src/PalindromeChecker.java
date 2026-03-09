// Recursive helper method
static boolean isPalindromeRecursive(String str, int left, int right) {
    // 1. Base condition: If the pointers meet or cross, we checked everything!
    if (left >= right) {
        return true;
    }

    // 2. If the outer characters don't match, it's not a palindrome
    if (str.charAt(left) != str.charAt(right)) {
        return false;
    }

    // 3. Recursive call: Move inward and call the method again
    return isPalindromeRecursive(str, left + 1, right - 1);
}
// Standardize input
String cleanInput = original.toLowerCase();

// UC9 Logic: Check palindrome using recursion
boolean isPalindrome = true; // Default to true for empty strings

if (cleanInput.length() > 0) {
// Start the recursion with the first and last index
isPalindrome = isPalindromeRecursive(cleanInput, 0, cleanInput.length() - 1);
        }

// Print result
        if (isPalindrome) {
        System.out.println("Result: Success! '" + original + "' is a palindrome.");
} else {
        System.out.println("Result: Fail! '" + original + "' is NOT a palindrome.");
}