package ArrayProblemSolving.Part1;

public class SearchForAnElement {
    //Linear Search
    public static boolean findTarget(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 7, 9, 12};
        boolean ans = findTarget(arr, 9);
        System.out.println(ans);
    }
}
