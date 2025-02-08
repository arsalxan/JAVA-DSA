public class sumofnnaturalno {
    public static int print(int n){
        if(n==1){return 1;}
        int sum=n+print(n-1);
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(print(5));
    }
}
