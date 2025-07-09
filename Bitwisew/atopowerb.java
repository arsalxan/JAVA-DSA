public class atopowerb {
    public static void atob(int a, int b){
        int result=1;
        while(b>0){
            int last=b&1;
            if(last!=0){
                result*=a;  
            }
            a=a*a;
            b=b>>1;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        atob(3,6);
    }
}
