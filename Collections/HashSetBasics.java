package Collections;
import java.util.HashSet;
import java.util.Set;
public class HashSetBasics {
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set2.add(5);
        set2.add(3);
        set2.add(4);
        set2.add(6);
        System.out.println(set1);
        System.out.println(set1.retainAll(set2));//true
        System.out.println(set1);// intersection of set1 and set2 = [3, 4]
        System.out.println(set2);
        System.out.println(set1.containsAll(set1));
        
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        st.add(20);
        System.out.println("Set is "+ st);
    }
}
