public class clearithbit {
    public static void clear(int n ,int i){
        int bitmask=~(1<<i);
        n=(n & bitmask);
        System.out.println(n);
    }
    public static void main(String[] args) {
        clear(5,2);
     }
}
