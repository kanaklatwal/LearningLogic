package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // List or Collection -> Interface

        // ArrayList -> concrete class
          //List<Integer> list = new ArrayList<>();
          //Collection<Integer> collection = new ArrayList<>();
          ArrayList<Integer> list1 = new ArrayList<>();
          list1.add(10);
          list1.add(20);
          list1.add(30);
          System.out.println(list1);
          list1.add(40);
          System.out.println(list1);

          list1.remove(2);
          System.out.println(list1);

          // addAll()
          List<Integer> list2 = new ArrayList<>();
          list2.add(50);
          list2.add(60);
          list2.add(70);

          list1.addAll(list2);
          System.out.println(list1);

          list1.removeAll(list2);
          System.out.println(list1);

          System.out.println("printing list2 : " + list2);
          list2.clear();
          System.out.println(list2.size());

          // I want to travel list using iterator
          Iterator<Integer> iterator = list1.iterator();
          while(iterator.hasNext()){
                System.out.println("Element : "+ iterator.next());
          }

          List<Integer> list3 = new ArrayList<>();
          list3.add(11);
          list3.add(12);
          list3.add(14);
          System.out.println(list3.get(1));//12
          System.out.println(list3.get(2));//14

          System.out.println("before set: " + list3);//[11, 12, 14]
          list3.set(0,100);     //set(index, value);
          System.out.println("After set: " + list3);//[100, 12, 14]

          //toArray
          Object[] arr = list3.toArray();
          for(Object obj: arr){
                System.out.println(obj); // 100 12 14
          }

          //contains
          System.out.println(list3.contains(100)); //true
          System.out.println(list3.contains(1000)); //false

          //Collection<Integer> collection = new ArrayList<>();

          list1.add(12);
          list1.add(6);
          System.out.println("Printing Entire List " + list1);

          //sort
          Collections.sort(list1);
          System.out.println("Printing Entire Sorted list "+ list1);

          ArrayList<Integer> newList = (ArrayList<Integer>)list1.clone();
          System.out.println("Printing the new List : " + newList);

          ArrayList<Integer> marks = new ArrayList<>();
          marks.ensureCapacity(100);

          System.out.println(newList.isEmpty());//false
          System.out.println(marks.isEmpty()); //true

          System.out.println(newList.indexOf(40));  //4

          // linkedlist

          LinkedList<Integer> list = new LinkedList<>();
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          System.out.println(list);
          list.remove(3);
          System.out.println(list);
          System.out.println(list.indexOf(4));

          LinkedList<Integer> llist = new LinkedList<>();
          llist.add(5);
          llist.add(6);
          llist.add(7);
          System.out.println( list.addAll(llist));
          System.out.println("New linked list is: " +list);
          System.out.println(list.removeAll(llist));

          //addFirst() and addLast()
          System.out.println("Printing original list : "+list);
          list.remove(2);
          System.out.println("Printing original list : "+list);
          list.addFirst(101);
          System.out.println(list);
          list.addLast(98);
          System.out.println(list);
          list.removeFirst();
          list.removeLast();
          System.out.println(list);
          System.out.println(list.peek());
          System.out.println(list.poll());
          System.out.println(list);
          System.out.println(list.offer(89));

    }

}
