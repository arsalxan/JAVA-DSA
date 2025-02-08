public class partyfriends {
    public static int friend(int n){
        if(n==1 || n==2){
            return n;
        }
        // for single
        int fsin=friend(n-1);
        // for pair
        int fpair=(n-1)*friend(n-2);
        return fsin+fpair;
    }
    public static void main(String [] args){
        System.out.println(friend(3));
    }
}
