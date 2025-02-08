public class rohmbus {
    public static void rohmbuspattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=0; j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
          System.out.println();
        }
    }
    public static void main(String agr[]){
        rohmbuspattern(15);
    }
}
