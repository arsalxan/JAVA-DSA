public class DoublyLinkedList {
    private static Node head;
    private static Node tail;
    private static int size;

    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public static void addFirst(int data) {
      Node newNode =new Node(data);
      size++;
      if(head==null){
        head=tail=newNode;
        return;
      }
      newNode.next = head;
      head.prev = newNode;
      head= newNode;
    }
    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public static void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode; // Update tail if adding at the end
        }
        temp.next = newNode;
    }
    // Add methods for inserting, deleting, and displaying elements
    // ...

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public static void display() {
        Node current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data);
            if(current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
         System.out.print("]");
        System.out.println();
    }
    public static void removeFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }
    public static void removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }
    public boolean checkPalindrome(){
        Node st=head;
        Node end= tail;
        while(st!=end){
            if(st.data!= end.data){
                return false;
            }
            st=st.next;
            end=end.prev;

        }
        return true;
    }

    public  void reverse(){
       Node curr=head;
       Node prev=null;
       tail=head; 
       while(curr!=null){
        Node next= curr.next;
        curr.next=prev;
        curr.prev=next;
        prev=curr;
        curr=next;
       }
       head=prev;
    }
 


    // Additional methods can be added as needed


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(10);
        dll.addLast(10);
        dll.add(1, 15); // Insert 15 at index 1
        System.out.println("Size of the list: " + dll.getSize());
        System.out.print("List elements: ");
        dll.display();
        dll.reverse();
        dll.display();
    }
}

