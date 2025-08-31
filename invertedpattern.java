public class invertedpattern {
    public static void main(String[] args) {
        int n = 10;
        for(int line=1; line<=n; line++) {
            for(int star=1; star<=n-line+1; star++) {
                System.out.print("*"); //dont use ln as it jump to next line and doesnt appear properly on screen
            }
            System.out.println();
        }
    }
    
}
