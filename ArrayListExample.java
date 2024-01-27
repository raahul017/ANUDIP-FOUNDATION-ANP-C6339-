//Read and store 'n' no. of elements to an arraylist using stream API, and display the same to user.
//From the above list filter and display only positive numbers.


package labPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayListExample {
    
	public static void main(String[] args) {
       
		Scanner scanner = new Scanner(System.in);
        // Input from user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Read 'n' elements from the user and store them in an ArrayList
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            numberList.add(element);
        }

         // Use Stream API to filter and display positive numbers
        List<Integer> positiveNumbers = numberList.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toList());

        // Display positive numbers
        System.out.println("Positive Numbers: " + positiveNumbers);

        scanner.close();
    }
}
