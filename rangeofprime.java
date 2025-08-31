// public class rangeofprime {
//     public static void rangeofprime(int n) {
//         for(int i=2; i<=n; i++) {
//             if(isPrime(i)) {
//                 System.out.print(i+ " ");
//             }
//         }
//         System.out.println(null);

//     }
//     public static void main(String[] args) {
//         System.out.println(rangeofprime(20));
//     }
    
// }

public class rangeofprime {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to print all prime numbers up to n
    public static void rangeOfPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Print a newline
    }

    public static void main(String[] args) {
        rangeOfPrime(1000); // Correctly calling the method
    }
}
