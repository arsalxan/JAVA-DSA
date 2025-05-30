import java.util.*;
// example is 1a2b3c4d== 1234abcd
public class interleave {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        Queue<Integer> q1= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(0);
        int size=q.size();
        for(int i=0;i<size/2;i++){
            q1.add(q.remove());
        }
        for(int i=0;i<size/2;i++){
           q.add(q1.remove());
           q.add(q.remove());
        }
        System.out.println(q);
    }
}
