public class floydstriangle {
    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {  // Outer loop for rows
            for (int j = 1; j <= i; j++) {  // Inner loop for columns
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();  // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        floyds_triangle(4);
    }
}
