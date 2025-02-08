public class setithbit {
    public static void set(int n, int i){
        int bitmask=1<<i;
        n=(n |bitmask);
        System.out.println(n);
    }
    public static void main(String[] args) {
        set(5,1);
     }
}
