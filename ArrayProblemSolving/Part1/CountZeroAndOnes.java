package ArrayProblemSolving.Part1;

public class CountZeroAndOnes {
    static int[] getZeroCount(int[] arr){
        int zeroCount = 0;
        int oneCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zeroCount++;
            }
            else{
                oneCount++;
            }
        }
        int ans[] = {zeroCount, oneCount};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 1, 1};
        int ans[] = getZeroCount(arr);
        System.out.println("Zero Count = "+ ans[0]);
        System.out.println("One Count = "+ ans[1+]);
    }

}
