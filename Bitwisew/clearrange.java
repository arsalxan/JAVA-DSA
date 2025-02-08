public class clearrange {
    public static int bit(int n, int i, int j){
        int a,b, bitmaskk;
        a=(~0)<<(j+1);
        b=(1<<i)-1;
        bitmaskk=a|b;
        return n&bitmaskk;
    }
    public static void main(String[] args) {
        System.out.println(bit(15,0,1));
    }
}
