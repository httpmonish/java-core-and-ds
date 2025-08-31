// import java.util.*;

// public class ctest7 {
//     public static void main(String args[]) {
//         int a = 63, b = 36;
//         boolean x = (a < b ) ? true : false;
//         int y= (a > b ) ? a : b;
//         System.out.println("x");
//         System.out.println(y);
//         }
//         }


        // Corrected With AI

        import java.util.*;

public class ctest7 {
    public static void main(String args[]) {
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false; // x is false since 63 is not less than 36
        int y = (a > b) ? a : b; // y will be 63, since a (63) is greater than b (36)
        
        // Print the values of x and y
        System.out.println(x); // This will print: false
        System.out.println(y); // This will print: 63
    }
}

    

