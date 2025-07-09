import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args) {
        int weight[]={10,20,30};
        int value[]={60,100,120};
        int w=50;
        double ratio[][]=new double[value.length][2];

        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=(double)value[i]/weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble((double[]o)->o[1]).reversed());
        double toatalValue=0;
        for(int i=0;i<value.length;i++){
            int idx=(int)ratio[i][0];
            if(w>=weight[idx]){
                w-=weight[idx];
                toatalValue+=value[idx];
            }
            else{
                toatalValue+=ratio[i][1] * w;
                break;
            }
        }
        System.out.println(toatalValue);
       


    }
}
