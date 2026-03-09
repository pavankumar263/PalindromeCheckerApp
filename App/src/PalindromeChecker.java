// UC10 Logic: Case-Insensitive & Space-Ignored Palindrome

// 1. Normalize string using String preprocessing and Regular expressions
// \\s+ is a regex that finds all spaces. We replace them with nothing ("").
// We also convert everything to lowercase.
String cleanInput = original.replaceAll("\\s+", "").toLowerCase();

// 2. Apply previous logic (Two-pointer approach is great here)
int left = 0;
int right = cleanInput.length() - 1;
boolean isPalindrome = true;

while (left < right) {
        if (cleanInput.charAt(left) != cleanInput.charAt(right)) {
isPalindrome = false;
        break; // Mismatch found
        }
left++;
right--;
        }

// Print result
        if (isPalindrome) {
        System.out.println("Result: Success! '" + original + "' is a palindrome.");
} else {
        System.out.println("Result: Fail! '" + original + "' is NOT a palindrome.");
}