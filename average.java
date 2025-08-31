import java.util.*;



public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the three numbers
        System.out.print("Enter the first number (A): ");
        double A = scanner.nextDouble();

        System.out.print("Enter the second number (B): ");
        double B = scanner.nextDouble();

        System.out.print("Enter the third number (C): ");
        double C = scanner.nextDouble();

        // Calculating the average
        double average = (A + B + C) / 3;

        // Printing the result
        System.out.println("The average of the three numbers is: " + average);

        // Closing the scanner
        scanner.close();
    }
}
