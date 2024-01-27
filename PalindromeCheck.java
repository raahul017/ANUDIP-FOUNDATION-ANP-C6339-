// Write a Java program to check if a given string is a palindrome. Use a stack to help you compare
//characters from the beginning and end of the string. Do not use any String functionalities to reverse the String.
//Use Stack data structure. You can use (A string is called Palindrome if the reverse of the string is the same
//as the original string. Example: “racecar”. )


package labPrograms;

import java.util.Stack;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s", "").toLowerCase();

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();
        
        int length = str.length();
        int halfLength = length / 2;
        for (int i = 0; i < halfLength; i++) {
            stack.push(str.charAt(i));
        }

        // Compare the remaining characters with the ones in the stack
        int startIndex = (length % 2 == 0) ? halfLength : halfLength + 1;
        for (int i = startIndex; i < length; i++) {
            char currentChar = str.charAt(i);
            if (stack.isEmpty() || stack.pop() != currentChar) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String palindrome1 = "racecar";
        String notPalindrome = "hello";

        System.out.println("Is '" + palindrome1 + "' a palindrome? " + isPalindrome(palindrome1));
        System.out.println("Is '" + notPalindrome + "' a palindrome? " + isPalindrome(notPalindrome));
    }
}
