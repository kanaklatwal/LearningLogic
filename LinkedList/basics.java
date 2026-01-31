package LinkedList;

// Types  of linkedList :-  1 singly  2 doubly  3 circular
public class basics{
    public static void displayRecusrively(Node head ){
        if(head == null) return;
        System.out.print(head.data+ " ");//5 3 9 8 16
        displayRecusrively(head.next);
    }
    public static void insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next!=null){
            t=t.next;
        }
        t.next = temp;
    }
    public static void displayRecusrivelyReverse(Node head ){
        if(head == null) return;
        displayRecusrivelyReverse(head.next);
        System.out.print(head.data+ " ");// 16 8 9 3 5
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
     public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
     }
     public static void main(String[] args){
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

        //Node temp = a;
        // for(int i = 1 ; i<=5; i++){
        //      System.out.print(temp.data + " "); //5 3 9 8 16 
        //      temp = temp.next;
        // }
        // while(temp!=null){   // printing a linked list
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }
        display(a);
        System.out.println();
        displayRecusrively(a);
        System.out.println();
        insertAtEnd(a, 87);
        display(a);
     }
}