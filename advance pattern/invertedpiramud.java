public class invertedpiramud {
    public static void inverted(int n){
        for(int i=1;i<n+1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        inverted(8);
    }
}
