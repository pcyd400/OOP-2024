package Week2;

import java.util.Scanner;

public class Fraction{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        // Check for denominator being zero (division by zero error)
        if (denominator == 0) {
            System.out.println("Error: Denominator cannot be zero.");
        } else {
            double decimalEquivalent = (double) numerator / denominator;
            System.out.printf("The decimal equivalent of the fraction %d/%d is: %.2f\n", numerator, denominator, decimalEquivalent);
        }

        scanner.close();
    }
}