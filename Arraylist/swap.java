import java.util.ArrayList;
import java.util.Scanner;
public class swap{
    public static void main(String [] arg){
        ArrayList<Integer> list= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<4;i++){
            list.add(i+1);
        }
        System.out.print(list);
        int temp= list.get(2);
        list.set(2,list.get(3));
        list.set(3,temp);
        System.out.print(list);
    }
}