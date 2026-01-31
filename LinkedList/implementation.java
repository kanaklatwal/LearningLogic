public class implementation{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{
         Node head = null;
         Node tail = null;
         void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
         }
         void insertAtBeginning(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head =  temp;
            }
         }
         void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
         }
         int size(){
            Node temp = head;
            int count =0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
         }
    }
    public static void main(String[] args){
        linkedList ll = new linkedList();
        ll.insertAtEnd(4);
        ll.display();//4
        ll.insertAtEnd(5);
        ll.display();// 4 -> 5
        System.out.println(ll.size() +" elements in the linked list.");
        ll.insertAtEnd(14);
        ll.display();// 4 -> 5 -> 14
        ll.insertAtBeginning(15);
        ll.display();

    }
}