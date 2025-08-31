// public class fnoverload {
//     public static int sum(int a, int b) {
//         return a+b;
//     }

//     public static int sum(int a, int b, int c) {
//         return a+b+c;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(3,5));
//         System.out.println(5,2,1);
//     }
    
// }
public class fnoverload {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));  // Calls the method with 2 parameters
        System.out.println(sum(5, 2, 1));  // Calls the method with 3 parameters
    }
}
