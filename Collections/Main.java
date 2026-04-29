package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
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
    }

}
