import java.util.*;
public class loops {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = 17, z = 1;
        
        // Start loop from 2 to avoid division by zero
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                z = 0;
                break;
            }
        }
        
        if (z == 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
