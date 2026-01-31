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
         void insertAtIndex(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtBeginning(val);
                return;
            }
            else if(idx<0||idx>size()){
                 System.out.println("Wrong index");
                 return;
            }          
            for(int i = 1; i<=idx-1; i++ ){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;  
         }
         int getAt(int idx){
            Node temp = head;
            if(idx<0||idx>size()){
                System.out.println("Wrong index");
                return -1;
            }  
            for (int i = 0; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
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
        ll.display();// 15-> 4 -> 5-> 14
        ll.insertAtIndex(2, 10);
        ll.display();// 15 -> 4->10->5->14
        ll.insertAtIndex(4, 17 );
        ll.display();//
        System.out.println(ll.tail.data);//14
        ll.insertAtIndex(0, 100);
        ll.display();// 100->15 -> 4->10->5->14
        System.out.println(ll.getAt(4));//17
        
    }
}