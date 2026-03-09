// Custom Node class for Singly Linked List
static class Node {
        char data;
        Node next;

        Node(char data) {
                this.data = data;
                this.next = null;
        }
}
// Standardize input
String cleanInput = original.toLowerCase();
boolean isPalindrome = true;

if (cleanInput.length() > 0) {
// 1. Convert string to linked list
Node head = new Node(cleanInput.charAt(0));
Node current = head;
    for (int i = 1; i < cleanInput.length(); i++) {
current.next = new Node(cleanInput.charAt(i));
current = current.next;
    }

// 2. Find the middle using Fast and Slow Pointer Technique
Node slow = head;
Node fast = head;
    while (fast != null && fast.next != null) {
slow = slow.next;         // moves 1 step
fast = fast.next.next;    // moves 2 steps
    }

// 3. In-Place Reversal of the second half
Node prev = null;
Node curr = slow; // slow is currently at the middle
    while (curr != null) {
Node nextTemp = curr.next;
curr.next = prev;
prev = curr;
curr = nextTemp;
    }

// 4. Compare halves
Node firstHalf = head;
Node secondHalf = prev; // prev is now the head of the reversed second half
    while (secondHalf != null) {
        if (firstHalf.data != secondHalf.data) {
isPalindrome = false;
        break;
        }
firstHalf = firstHalf.next;
secondHalf = secondHalf.next;
    }
            }

// Print result
            if (isPalindrome) {
        System.out.println("Result: Success! '" + original + "' is a palindrome.");
} else {
        System.out.println("Result: Fail! '" + original + "' is NOT a palindrome.");
}