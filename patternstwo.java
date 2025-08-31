public class patternstwo {
    public static void hollow_rectangle(int totRows, int totCols) {
        // Outer loop
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }

    public static void main(String[] args) {
        // Call both functions
        System.out.println("Hollow Rectangle:");
        hollow_rectangle(5, 7);
        
        System.out.println("\nInverted Rotated Half Pyramid:");
        inverted_rotated_half_pyramid(4);
    }
}
  
