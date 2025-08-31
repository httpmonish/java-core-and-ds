public class charpattern {
    public static void main(String[] args) {
        int n = 5; // Number of lines to print (for letters A to E)

        for(int line = 1; line <= n; line++) {
            // Alphabet print
            for(int letter = 0; letter < line; letter++) {
                System.out.print((char)('A' + letter)); // Convert to corresponding alphabet
            }
            System.out.println();
        }
    }
}




// public class halfpyramid {
//     public static void main(String[] args) {
//         int n = 10;

//         for(int line=1; line<=n; line++){
//             //number print
//             for(int number =1; number<=line; number++) {
//                 System.out.print(number);
//             }
//             System.out.println();
//         }

//     }
    
// }