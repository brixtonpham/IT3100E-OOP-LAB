/*Note: You must create a new Java project for this exercise.
- The array can be entered by the user or a constant. */

import java.util.Arrays;
import java.util.Scanner;

public class SortNumericArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose how to input the array:");
        System.out.println("1. Enter array manually");
        System.out.println("2. Use a constant example");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        int[] array;
        switch (choice) {
            case 1:
                array = input(scanner);
                break;
            case 2:
                array = new int[] { 5, 3, 8, 2, 1 }; // constant example
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                scanner.close();
                return;
        }

        Arrays.sort(array);

        // Calculate the sum 
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / array.length;

        // Result
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }

    // Input array
    public static int[] input(Scanner scanner) {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return array;
    }
}
