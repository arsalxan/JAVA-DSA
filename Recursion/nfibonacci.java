public class nfibonacci {
    public static void fib(int n,int a,int b){
        if(n>0){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
            fib(n-1,a,b); 
        }
        
    }
    public static void main(String[] args) {
        fib(10,0,1);
    }
    
}
