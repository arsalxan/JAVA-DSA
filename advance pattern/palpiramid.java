public class palpiramid {
    public static void pr(int n){
        for(int i=1;i<n+1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>1;j--){
                System.out.print(j);}
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        pr(9);
    }
}

