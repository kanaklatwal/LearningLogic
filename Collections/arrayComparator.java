package Collections;
import java.util.Arrays;
public class arrayComparator {
    public static void main(String[] args) {
        Integer[] arr = {5, 1, 7, 2, 8, 4};
        Arrays.sort(arr, new ReverseArrayComparator());
        for(int a: arr){
            System.out.print(a + " ");
        }
    }
}
