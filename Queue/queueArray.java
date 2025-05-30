
public class queueArray {
    public static class Queue{
    public  int size;
    public  int[] arr;
    public  int rear;

    Queue(int n){
        this.size=n; this.rear=-1; this.arr= new int[size];
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    public void add(int data){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear]=data;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Nothing to remove");
            return -1;
        }
        int front= arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }
    public String toString(){
        StringBuilder ans=new StringBuilder("[ ");
        // if we use Arrays.toString() method here it will add the unused indeces as well
        for(int i=0;i<=rear;i++){
            ans.append(arr[i]);
            if(i<rear){ ans.append(", ");}
        }
        ans.append(" ]");
        return ans.toString();
    }
    }
   

    public static void main(String[] args) {
        Queue newQueue= new Queue(4);
        newQueue.add(1);
        newQueue.add(2);
        newQueue.add(3);
        newQueue.add(4);
        System.out.println(newQueue);
        // using array this takes order on n O(n) times
        newQueue.remove();
        newQueue.remove();
        System.out.println(newQueue);
    }
}
