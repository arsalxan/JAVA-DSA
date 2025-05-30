public class Linked {
    public static int size;
    public static Node head;
    public static Node tail;
    public static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head== null){
            head=tail=newNode;
            return;
        }
        newNode.next= head;
        head= newNode;
    }
    public static void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next= newNode;
        tail=newNode;
    }

    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.printf("%d ",temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    public static void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public int recSearch(int i, int key, Node temp){
       if(temp==null){
        return -1;
       }
       if(temp.data==key){
        return i;
       }
       return recSearch(i+1, key, temp);
    }
    public static int findKey(int key){
        Node temp= head;
        if(head==null){
            return -1;
        }
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }
    public static void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node temp=head;
        Node newNode= new Node(data);
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("Nothing to remove");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("Nothing to remove.");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        int val= tail.data;
        return val;
    }
    public static void main(String[] args) {
        Linked ll= new Linked();
        ll.addFirst(3);
        ll.addFirst(30);
        ll.addLast(7);
        ll.addLast(67);
        ll.print();
        // ll.removeLast();
        ll.removeFirst();
        ll.print();
       
    }
}
