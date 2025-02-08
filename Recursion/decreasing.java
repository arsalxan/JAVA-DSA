public class decreasing {
    public static void dec(int n){
        if(n==1 ){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        dec(n-1);

    }
    public static void  main(String [] arg){
        dec(10);
    }
}
