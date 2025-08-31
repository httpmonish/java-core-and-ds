import java.util.Scanner;

public class gst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the costs of each item
        System.out.print("Enter the cost of the pencil: ");
        float pencilCost = sc.nextFloat();

        System.out.print("Enter the cost of the pen: ");
        float penCost = sc.nextFloat();

        System.out.print("Enter the cost of the eraser: ");
        float eraserCost = sc.nextFloat();

        // Calculating total cost
        float totalCost = pencilCost + penCost + eraserCost;

        // Calculating 18% GST
        float gst = totalCost * 0.18f;

        // Calculating final amount with GST
        float finalAmount = totalCost + gst;

        // Displaying the results
        System.out.println("Total cost (without GST): " + totalCost);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final amount (with GST): " + finalAmount);

        // Closing the scanner
        sc.close();
    }
}

