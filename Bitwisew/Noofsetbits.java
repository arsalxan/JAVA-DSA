public class Noofsetbits {
    // no of ones in a number\
    public static void set(int n){
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        set(3);
    }
}
