public class onefaterzero {
    
        public static void ftp(int n){
            int m=1;
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    if((i+j)%2==0){ System.out.print("1 ");}
                    else { System.out.print("0 ");}
                } System.out.println();
            }
        }
        public static void main(String arg[]){
            ftp(5);
        }
    }
    

