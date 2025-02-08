public class nested{
    public static void main(String[] args) {
        int k=1,n=4;
        for(int i=0;i<4;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.println(" ");
            }
            for(int j=0;j<k;j++){
                System.out.print("*");
            }k++;System.out.println();
        }
    }
}