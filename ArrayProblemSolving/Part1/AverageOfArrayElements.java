package ArrayProblemSolving.Part1;

public class AverageOfArrayElements {
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 3, 3};
//        int sum = 0;
//        double avg = 0.0;
//        for(int i=0; i<arr.length; i++){
//            sum += arr[i];
//        }
//        avg = sum/arr.length;
//        System.out.println("the average of the array elements is : " + avg);
//    }

    public static double getAverage(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        double avg = (double) sum/arr.length;
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,3};
        System.out.println("The average of the elements in the array is : "+ getAverage(arr));
    }
}
