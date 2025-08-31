// public class bionomialfn {
//    public static int bionomialfn(int n , int r ) {
//     int fact_n = factorial(n);
//     int fact_r = factorial(r);
//     int fact_nmr = factorial(n-r);

//     int bionomialfn = fact_n / (fact_r * fact_nmr);
//     return bionomialfn;


//    } 
//    public static void main(String[] args) {
//      System.out.println(bionomialfn(5,2 0));
//    } 
// }


public class BinomialFn {

    // Method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    // Method to calculate binomial coefficient C(n, r)
    public static int binomialFn(int n, int r) {
        if (r > n) {
            return 0; // If r > n, C(n, r) is 0
        }
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binomialCoefficient = fact_n / (fact_r * fact_nmr);
        return binomialCoefficient;
    }

    public static void main(String[] args) {
        System.out.println(binomialFn(5, 2)); // Output: 10
    }
}