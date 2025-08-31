// import java.util.*;
// // Area of a Square
// public class Solution {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int side = sc.nextInt();
// int area = side * side;
// System.out.println("area of the square is : " + area);
// }
// }
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Using try-with-resources to automatically close the Scanner
        try (Scanner sc = new Scanner(System.in)) {
            int side = sc.nextInt();
            int area = side * side;
            System.out.println("Area of the square is: " + area);
        }
        // No need to manually close the Scanner here
    }
}

