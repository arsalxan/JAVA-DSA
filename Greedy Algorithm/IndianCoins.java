import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,500,1000};
        int money=11210;
        int totalCoins=0;
        List<Integer> list= new ArrayList<>();
        for(int i=coins.length-1;i>=0;i--){
            while(money>=coins[i]){
                list.add(coins[i]);
                money-=coins[i];
                totalCoins++;
            }
        }
        System.out.println(totalCoins+"\n"+list);
    }
}
