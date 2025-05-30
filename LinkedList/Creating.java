/**
 * A singly linked list implementation with common operations.
 */
public class Creating {

    /**
     * Node class representing each element in the linked list.
     */
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // --- Core Linked List Operations ---

    /** Adds a node at the beginning of the list. */
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /** Adds a node at the end of the list. */
    public void addLast(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    /** Adds a node at a specific index. */
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while (i < index - 1) {
            i++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    /** Removes and returns the first node's value. */
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    /** Removes and returns the last node's value. */
    public int removeLast() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        size--;
        return val;
    }

    /** Returns the index of the first occurrence of the key, or -1 if not found. */
    public int indexOf(int key) {
        Node temp = head;
        for (int i = 0; temp != null; i++) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    /** Recursive search for a key, returns index or -1. */
    public int recSearch(int i, int key, Node temp) {
        if (temp == null) {
            return -1;
        }
        if (temp.data == key) {
            return i;
        }
        return recSearch(i + 1, key, temp.next);
    }

    /** Prints the linked list. */
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    // --- Utility and Advanced Operations ---

    /** Reverses the linked list. */
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    /** Deletes the nth node from the end of the list. */
    public void deleteNthFromLast(int n) {
        int sizee = 0;
        Node temp = head;
        while (temp != null) {
            sizee++;
            temp = temp.next;
        }
        if (n > sizee)
            return;
        if (n == sizee) {
            head = head.next;
            size--;
            return;
        }
        int idx = 1;
        int toFind = sizee - n;
        Node prev = head;
        while (idx < toFind) {
            prev = prev.next;
            idx++;
        }
        prev.next = prev.next.next;
        size--;
    }

    /** Checks if the list contains a cycle. */
    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /** Removes a cycle from the list if present. */
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        Node prev = null;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (!cycle) {
            return;
        }
        slow = head;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    /** Finds and returns the middle node. */
    public Node findMidNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /** Checks if the linked list is a palindrome. */
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node midNode = findMidNode();
        Node curr = midNode;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        // Optionally, restore the list here
        return true;
    }

    /** Finds the middle node (used for merge sort and zigzag). */
    public Node mid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /** Merges two sorted linked lists. */
    public Node merge(Node h1, Node h2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (h1 != null && h2 != null) {
            if (h1.data < h2.data) {
                temp.next = h1;
                h1 = h1.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
            }
            temp = temp.next;
        }
        while (h1 != null) {
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while (h2 != null) {
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return dummy.next;
    }

    /** Merge sort for linked list. */
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = mid(head);
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthead);
        return merge(newLeft, newRight);
    }

    /** Rearranges the list in zigzag fashion: L0→Ln→L1→Ln-1→L2→Ln-2→... */
    public void zigzag() {
        Node mid = mid(head);
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node RH = prev;
        Node LH = head;
        Node nextLeft, nextRight;
        while (RH != null && LH != null) {
            nextLeft = LH.next;
            LH.next = RH;
            nextRight = RH.next;
            RH.next = nextLeft;
            RH = nextRight;
            LH = nextLeft;
        }
    }

    public void Q2(int m, int n) {

        Node curr = head, t;
        
        while (curr != null) {
            for (int count = 1; count < m && curr != null; count++)
                curr = curr.next;
            if (curr == null)
                return;
            t = curr.next;
            for (int count = 1; count <= n && t != null; count++) {
                t = t.next;
            }
            curr.next = t;
            curr = t;
        }

    }
    public void swap(int key1,int key2){
        if(key1==key2){
            return;
        }
        Node currX=head;
        Node prevX=null;
        while(currX!=null && currX.data!=key1){
            prevX=currX;
            currX=currX.next;
        }
        Node currY=head;
        Node prevY=null;
        while(currY!=null && currY.data!=key2){
            prevY=currY;
            currY=currY.next;
        }
        if(currX==null || currY==null){
            return;
        }
        if(prevX==null){
            head=currY;
        }
        else{
            prevX.next=currY;
        }
        if(prevY==null){
            head=currX;
        }
        else{
            prevY.next=currX;
        }
        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;
    }
    

    // --- Main Method for Testing ---

    public static void main(String[] args) {
        Creating ll = new Creating();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(8);
        ll.addFirst(9);
        ll.reverse();
        ll.print();
        ll.swap(3, 8);
        ll.print();
        // ll.addFirst(5);
        // ll.addFirst(2);
        // ll.addLast(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();
        // ll.zigzag();
        // ll.print();

        // Uncomment below to test cycle detection and removal
        // ll.head = new Node(1);
        // Node temp = new Node(2);
        // ll.head.next = temp;
        // ll.head.next.next = new Node(3);
        // ll.head.next.next.next = temp;
        // System.out.println(ll.isCycle());
        // ll.removeCycle();
        // System.out.println(ll.isCycle());
    }
}