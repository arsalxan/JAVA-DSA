public class tylingproblem{
    public static int counttile(int n){
        if(n>-1){
        if(n==0|| n==1){
            return 1;
        }
        int fmn1=counttile(n-1);
        int fmn2= counttile(n-2);
        return fmn1+fmn2;
    }
    return -1;
    }
    public static void main(String[] args){

                System.out.println(counttile(-8));
    }
}