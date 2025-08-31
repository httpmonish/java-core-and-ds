import java.util.Scanner;

public class sumofint {
     
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int evenSum = 0;
        int oddSum = 0;
        
        System.out.println("Enter integers (type '0' to finish):");
        
        while (true) {
            int num = scanner.nextInt();
            
            // Check if the user wants to stop entering numbers
            if (num == 0) {
                break;
            }
            
            // Check if the number is even or odd
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        
        scanner.close();
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

    
    

