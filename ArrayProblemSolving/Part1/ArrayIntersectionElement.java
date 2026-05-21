package ArrayProblemSolving.Part1;

public class ArrayIntersectionElement {
    static int[] getIntersection(int[] arr1, int[] arr2){
        int[] newArray = new int[Math.min(arr1.length, arr2.length)];
        int k =0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                   newArray[k] = arr1[i];
                   k++;
                   break;
                }
            }
        }
//        if(k == 0){
//            System.out.println("No common elements");
//        }
//        else{
//            for(int i=0;i<k;i++){
//                System.out.print(newArray[i]+" ");
//            }
//        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 9};
        int[] arr2 = {1, 2, 7, 0};
        int[] ans = getIntersection(arr1, arr2);
        System.out.println("The intersection of the arrays are: ");
        for(int i : ans){
            if(i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
