// UC13: Add the classic Two-Pointer Strategy for comparison
class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String original) {
        String cleanInput = original.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanInput.length() - 1;

        while (left < right) {
            if (cleanInput.charAt(left) != cleanInput.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
// UC13 Logic: Performance Comparison

// Define the algorithms we want to test
PalindromeStrategy[] strategies = {
        new TwoPointerStrategy(),
        new StackStrategy(),
        new DequeStrategy()
};

String[] strategyNames = {"Two-Pointer", "Stack", "Deque"};

System.out.println("--- Performance Comparison for: '" + original + "' ---");

// Loop through each strategy, run it, and time it
for (int i = 0; i < strategies.length; i++) {
// 1. Capture start time
long startTime = System.nanoTime();

// 2. Run algorithm
boolean result = strategies[i].checkPalindrome(original);

// 3. Capture end time
long endTime = System.nanoTime();

// Calculate execution time
long duration = endTime - startTime;

// 4. Display results
    System.out.println(strategyNames[i] + " Strategy:");
    System.out.println("  Result: " + result);
    System.out.println("  Time: " + duration + " nanoseconds\n");
}