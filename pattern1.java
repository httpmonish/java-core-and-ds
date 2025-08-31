// public class pattern1 {
//     public static void main(String[] args) {
//         for(int line = 1; line <= 4 ; line ++);
//     }{
//         for(int star = 1; star <= line; star++);
//     }{
//         System.out.println('*');
//     }
//     {
//         System.out.println(nextLine);
//     }
// }

public class pattern1 {
    public static void main(String[] args) {
        // Loop for each line
        for (int line = 1; line <= 20; line++) {
            // Loop to print stars in each line
            for (int star = 1; star <= line; star++) {
                System.out.print('*'); // Print '*' without newline
            }
            System.out.println(); // Move to the next line after printing all stars in the current line
        }
    }
}