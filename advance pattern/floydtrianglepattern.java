public class floydtrianglepattern {
    public static void ftp(int n){
        int m=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(m+" ");
                m++;
            } System.out.println();
        }
    }
    public static void main(String arg[]){
        ftp(4);
    }
}
