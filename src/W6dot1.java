/*
** This program takes an investment amount and an annual interest rate inputted by the user and calculates the
* future value of an investment for a period of ten years.
 */
import java.util.Scanner;
public class W6dot1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Introduce the program to the user
            System.out.print("Given an investment amount and an annual interest rate, this program" +
                             " \nwill calculate the future value of the investment for a period of" +
                             " \nten years.");

            // Prompt the user a value for the investment
            System.out.print("\nEnter the a positive, non-zero value for the investment:");
            // Save the user input into a variable
            int invest = scanner.nextInt();
            // Prompt the user to enter a value for the interest rate that is between 0 and 100
            System.out.print("\nEnter an annual interest rate, between 0 and 100:");
            // Save the user input into a variable
            int rate = scanner.nextInt();


        }
    }
}
