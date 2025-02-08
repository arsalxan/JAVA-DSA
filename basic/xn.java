public class xn {
    public static void calc(long num, int power){
        int ans=1;
        if(power<0){ power=-power; num=1/num;}
        while(power>0){
            if(power%2==1){
                ans*=num;
            }
            power/=2; num*=num;
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        int num=3, power=-5;
        calc(num,power);
    }
}
