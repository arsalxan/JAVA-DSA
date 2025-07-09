import java.util.*;

public class MaxPair {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        List<List<Integer>> list= new ArrayList<>();
        list.add(Arrays.asList(pairs[0][0],pairs[0][1]));
        int totalPairs=1;
        int pairLast=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>=pairLast){
                totalPairs++;
                pairLast=pairs[i][1];
                 list.add(Arrays.asList(pairs[i][0],pairs[i][1]));
            }
        }
        System.out.println(totalPairs+"\n"+list);
    }
}
