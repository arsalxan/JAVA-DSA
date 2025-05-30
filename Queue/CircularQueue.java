public class CircularQueue {

    public static class Queue {
        public int size;
        public int[] arr;
        public int rear;
        public int front;

        Queue(int n) {
            this.size = n;
            this.rear = -1;
            this.front=-1;
            this.arr = new int[size];
        }

        public boolean isEmpty() {
            return rear == -1 && front==-1;
        }
        public boolean isFull(){
            return (rear+1)%size==front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // for first element 
            if(front==-1){
                front++;
            }
            rear=(rear+1)%size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Nothing to remove");
                return -1;
            }
            int result=arr[front];
            
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result= arr[front];
            return result;
        }
    }

    public static void main(String[] args) {
        Queue newQueue = new Queue(4);
        newQueue.add(1);
        newQueue.add(2);
        newQueue.add(3);
        newQueue.add(4);
        while(!newQueue.isEmpty()){
            System.out.println(newQueue.peek());
            newQueue.remove();
        }
    }
}
