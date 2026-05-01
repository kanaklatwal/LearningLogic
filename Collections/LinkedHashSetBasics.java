package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetBasics {
    public static void main(String[] args) {

        // HAshSet -> O(1)
        //LinkedHAshSet -> O(n)
        // TreeSet -> BST ->O(log n)
        Set<Integer> st = new LinkedHashSet<>();
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        st.add(20);
        System.out.println("Set is "+ st);

        Set<Integer> ts = new TreeSet<>();
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
