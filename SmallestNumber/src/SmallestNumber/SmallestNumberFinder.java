package SmallestNumber;

import java.util.Scanner;

public class SmallestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int numCount = scanner.nextInt();

        if (numCount <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        double[] numbers = new double[numCount];
        for (int i = 0; i < numCount; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double smallest = findSmallestNumber(numbers);
        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }

    public static double findSmallestNumber(double[] numbers) {
        if (numbers.length == 0) {
            return Double.NaN; // Return NaN if the array is empty
        }

        double smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
}
