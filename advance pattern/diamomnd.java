public class diamomnd {
    public static void diamomndf(int n){
        for(int i=1;i<=n;i++){
            for(int j=0; j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
           /*  for(int j=1;j<i;j++){
                System.out.print("*");
            }*/
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=0; j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            /*for(int j=1;j<i;j++){
                System.out.print("*");
            }*/
            System.out.println();
        }
        
    }
    public static void main(String arg[]){
        diamomndf(4);
    
    }
}
