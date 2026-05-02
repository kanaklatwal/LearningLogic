package Collections;

import java.util.Comparator;

public class ReverseArrayComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
       // return Integer.compare(o1, o2);// 1 2 4 5 7 8
        return 0 - Integer.compare(o1, o2); //8 7 5 4 2 1

    }
}
