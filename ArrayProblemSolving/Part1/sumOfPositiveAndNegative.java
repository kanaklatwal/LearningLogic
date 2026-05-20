package ArrayProblemSolving.Part1;

public class sumOfPositiveAndNegative {
    static int[] getPosNevSum(int[] arr){
        int posSum = 0;
        int negSum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                negSum += arr[i];
            }
            else{
                posSum += arr[i];
            }
        }
        int ans[] = {posSum, negSum};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,-3,5,-7,9};
        int ans[] = getPosNevSum(arr);
        System.out.println("Positive sum = "+ ans[0]);
        System.out.println("Negative sum = " + ans[1]);
    }
}
