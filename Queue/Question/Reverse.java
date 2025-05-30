import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        Stack<Integer> s= new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        System.out.println(q);
        
    }
}
