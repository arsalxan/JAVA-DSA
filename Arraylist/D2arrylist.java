import java.util.ArrayList;

public class D2arrylist {
    public static void intput(ArrayList<ArrayList<Integer>> list){
        ArrayList<Integer> small= new ArrayList<>();
        small.add(2);
        small.add(0);
        small.add(2);
        small.add(0);
        list.add(small);
    }
    public static void main(String [] at){
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        intput(list);
        intput(list);
        for(int i=0;i<list.size();i++){
            ArrayList<Integer> cuArrayList=list.get(i);
            System.out.println(cuArrayList);

            }
        }
    }

