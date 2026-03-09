// UC11: Dedicated service class (Single Responsibility Principle)
class PalindromeService {

    // Encapsulate the logic inside this exposed method
    public boolean checkPalindrome(String original) {
        if (original == null || original.isEmpty()) {
            return true;
        }

        // Normalize string
        String cleanInput = original.replaceAll("\\s+", "").toLowerCase();

        // Internal Data Structure & Logic (Array / Two-Pointer approach)
        int left = 0;
        int right = cleanInput.length() - 1;

        while (left < right) {
            if (cleanInput.charAt(left) != cleanInput.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }
}