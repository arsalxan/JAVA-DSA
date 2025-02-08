public class LinkedList {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
    }
    public void addLast(int data){
        size++;
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.err.println();
    }
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);return;
        }
        int i=0;Node temp=head;Node newNode= new Node(data);
        while(i<idx-1){
            i++;
         temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public static void main(String[] arg) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,5);
        ll.print();

    }
}
