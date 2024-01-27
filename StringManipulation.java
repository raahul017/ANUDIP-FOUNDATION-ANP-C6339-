//Write a Java program that uses lambda expressions to manipulate strings. Create lambda
//expressions to perform the following operations on a given string:

// Convert the string to uppercase

// Convert the string to lowercase

//Reverse the string



package java8_Features;

import java.util.function.Function;

public class StringManipulation {
    public static void main(String[] args) {
        
    	String inputString = "Hello World";
    	
        // Convert the string to uppercase
        String UpperCase = manipulateString(inputString, str -> str.toUpperCase());
        System.out.println("Uppercase: " + UpperCase);

        // Convert the string to lowercase
        String LowerCase = manipulateString(inputString, str -> str.toLowerCase());
        System.out.println("Lowercase: " + LowerCase);

        // Reverse the string
        String Reverse = manipulateString(inputString, str -> {
            StringBuilder reverse = new StringBuilder(str);
            return reverse.reverse().toString();
        });
        System.out.println("Reverse String: " + Reverse);
    }

    private static String manipulateString(String input, Function<String, String> operation) {
        return operation.apply(input);
    }
}
