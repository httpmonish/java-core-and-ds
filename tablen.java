import java.util.Scanner;

public class tablen {
    public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int N = scanner.nextInt();

        System.out.println("Multiplication Table of " + N + ":");

        // Loop to print the multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        scanner.close();
    }
}
    

