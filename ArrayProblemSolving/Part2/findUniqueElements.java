package ArrayProblemSolving.Part2;

public class findUniqueElements {
    public static int getUniqueElements(int[] nums){
        int xorSum = 0;
        for(int n: nums){
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int[] arr= {1,1,2,2,3,4,4,5,5,6,6};
        System.out.println(getUniqueElements(arr));
    }
}
