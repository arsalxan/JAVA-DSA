import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Deque {
    public Node head;

    Deque() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }

    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("Nothing to remove");
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
     public int removeLast() {
        if (isEmpty()) {
            System.out.println("Nothing to remove");
            return -1;
        }
        if(head.next==null){
            int result =head.data;
            // removeFirst();
            head=null;
            return result;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int last=temp.next.data;
        temp.next=null;
        return last;
    }
     public int getLast() {
        if (isEmpty()) {
            System.out.println("Nothing to remove");
            return -1;
        }
        if(head.next==null){
            int result =head.data;
            return result;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int last=temp.next.data;
        return last;
    }
    public static void main(String[] args) {
        Deque d= new Deque();
        d.addFirst(2);
        d.addFirst(3);
        d.addLast(4);
        d.addLast(5);
        while(!d.isEmpty()){
            // System.out.println(d.removeFirst());
            System.out.println(d.getLast());
            d.removeLast();
        }
    }


}
