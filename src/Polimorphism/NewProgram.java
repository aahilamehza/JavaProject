package Polimorphism;
import java.util.Scanner;

public class NewProgram {
    public static void main(String[] args) {
        int z = 0, p = 0, n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to input:");
        int n1 = scanner.nextInt();
        int[] numbers = new int[n1]; // Initialize array with n1

        System.out.println("Please enter " + n1 + " integers (positive, negative, or zero):");
        for (int i = 0; i < n1; i++) {
            numbers[i] = scanner.nextInt(); // Read numbers into the array
        }

        // Count positives, negatives, and zeros
        for (int number : numbers) {
            if (number > 0) {
                z++;
            } else if (number < 0) {
                p++;
            } else {
                n++;
            }
        }

        // Print results
        System.out.println("Positive numbers: " + z);
        System.out.println("Negative numbers: " + p);
        System.out.println("Zeros: " + n);
        
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
