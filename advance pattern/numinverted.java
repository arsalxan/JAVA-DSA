public class numinverted {
    public static void num_inverted(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
public static void main(String arg[]){
    num_inverted(5);
}
}
