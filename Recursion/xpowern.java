public class xpowern {
    public static int powerr(int a, int b){
        if(b==0){
            return 1;
        }
        int p=powerr(a,b/2);
        if(b%2==0){
            return p*p;
        }
        return a*p*p;
    }
    public static void main(String[] arg){
        System.out.print(powerr(2,3));
    }
}
