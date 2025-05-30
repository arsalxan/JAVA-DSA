import java.util.PriorityQueue;

public class Q2 {
    public static void minCost(int[] arr) {
        PriorityQueue<Integer> pr = new PriorityQueue<>();
        for(int i:arr){
            pr.add(i);
        }
        int res=0;
        while(pr.size()>1){
            int first=pr.poll();
            int second= pr.poll();
            res+=second+first;
            pr.add(second+first);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 6 };
        minCost(arr);
    }

}
