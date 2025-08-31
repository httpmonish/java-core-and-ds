import java.util.*;
public class scanarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A[] = {1,2,4,5,6,7,5,9,7,5,15,36,56};
        int key;
        System.out.println("Enter a Key ");
        key = sc.nextInt();

        for(int i=0; i<A.length; i++)
        {
            if(key==A[i]){
                System.out.println("Elemt Found at : " +i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");

    }

    
}
