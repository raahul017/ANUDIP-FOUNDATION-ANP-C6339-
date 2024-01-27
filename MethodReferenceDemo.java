//Write a Java program that demonstrates the use of method references for static methods.
//Create a functional interface and use a method reference to call a static method that
//calculates the square of a number.


package java8_Features;

//Functional interface with a single abstract method
interface SquareCalculator {
 int calculateSquare(int number);
}

class MathUtil {
 static int square(int x) {
     return x * x;
 }
}

public class MethodReferenceDemo {
 public static void main(String[] args) {
	 
     // Using a method reference for static method
     SquareCalculator referenceCalculator = MathUtil::square;
     int result = referenceCalculator.calculateSquare(5);
     System.out.println("Square of the number: " + result);
 }
}
