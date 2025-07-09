import java.util.*;
public class MaxActiviy{
    public static void maxUtility(int[] start, int[] end){
        int activity[][]= new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));
        List<Integer> li= new ArrayList<>();
        int maxAct=1;
        li.add(activity[0][0]);
        int lastAct=activity[0][2];
        for(int i=1;i<start.length;i++){
            if(activity[i][1]>=lastAct){
                maxAct++;
                lastAct=activity[i][2];
                li.add(activity[i][0]);
            }
        }
        System.out.println("Maximum Activity: "+maxAct);
        for(int i=0;i<li.size();i++){
            System.out.print("A"+li.get(i)+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int []start={1,3,0,5,8,5};
        int [] end={2,4,6,7,9,9};
        //if not sorted
        maxUtility(start, end);
        // int maxAct=0;
        
        // List<Integer> li= new ArrayList<>();
        // // for first activity
        // maxAct=1;
        // li.add(0);
    //     int lastAct= end[0];
    //     for(int i=1;i<end.length;i++){
    //         if(start[i]>= lastAct){
    //             maxAct++;
    //             lastAct=end[i];
    //             li.add(i);
    //         }
    //     }
    //     System.out.println("MaxActivity: "+maxAct);  
    //     for(int i=0;i<li.size();i++){
    //         System.out.print("A"+li.get(i)+" ");
    //     }      
    }
}