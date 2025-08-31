import java.util.*;

public class ternarop {
    public static void main(String[] args) {
        // ex1
        int number = 9;

        String type = ((number%2) == 0) ? "even" : "odd";
        System.out.println(type);

            // ex2
        int marks = 34;

        String reportCard = marks >= 35 ? "PASS" : "FAIL";
        System.out.println(reportCard);
    }
    
}
