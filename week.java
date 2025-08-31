import java.util.Scanner;
public class week {


    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a week number
        System.out.print("Enter a week number (1-7): ");
        int weekNumber = scanner.nextInt();

        // Use switch case to print the day of the week
        switch (weekNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid week number. Please enter a number between 1 and 7.");
                break;
        }

        // Close the scanner object
        scanner.close();
    }
}

    

