// Standardize input
String cleanInput = original.toLowerCase();

// UC4 Logic: Convert string to char[]
char[] charArray = cleanInput.toCharArray();

// Use two-pointer approach
int left = 0;
int right = charArray.length - 1;
boolean isPalindrome = true;

while (left < right) {
        // Compare start & end characters
        if (charArray[left] != charArray[right]) {
isPalindrome = false; // Mismatch found
        break; // Stop checking further to save time
        }
left++;  // Move the left pointer forward
right--; // Move the right pointer backward
        }

// Print the result
        if (isPalindrome) {
        System.out.println("Result: Success! '" + original + "' is a palindrome.");
} else {
        System.out.println("Result: Fail! '" + original + "' is NOT a palindrome.");
}