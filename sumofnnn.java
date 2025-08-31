// public class sumofnnn {
//     public static void main(String[] args) {
//         int n = 5;
//         int sum = 0;
//         int i = 1;
//         while(i<=n) {
//             sum = sum + i;
//             i++;
//         }
//         System.out.println(sum);
//     }
    
// }


import java.util.Scanner;

public class sumofnnn {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the terminal
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(); // Read an integer from the user
        
        int sum = 0; // Initialize sum to 0
        int i = 1;   // Start with the first natural number
        
        // Calculate the sum of the first n natural numbers
        while (i <= n) {
            sum += i; // Add i to sum
            i++;      // Increment i
        }
        
        // Print the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}