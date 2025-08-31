public class factorial {
    public static void main(String args[]) {
        System.out.println(factorial(4)); // Output: 24
    }

    // Method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }
}