public class QueueLinkedList {
    public static class Node{
        public int data;
        public Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class Queue{
        public Node head;
        Queue(){
            head=null;
        }
        public boolean isEmpty(){
            return head==null;
        }
        public void add(int data){
            Node newNode= new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=null;
        }
        public int remove(){
            if(head==null){
                System.out.println("Nothing to remove");
                return -1;
            }
            int result=head.data;
            head=head.next;
            return result;
        }
        public int peek(){
             if(head==null){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args){
        Queue q= new Queue();
        q.add(1);
        q.remove();
        System.out.println(q.head);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
