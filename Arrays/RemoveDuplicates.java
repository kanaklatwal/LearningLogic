// Remove duplicates from arrays
package Arrays;
public class RemoveDuplicates{
    public static int removeDuplicates(int[] arr){
        int i =0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i] =arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4};
        int k = removeDuplicates(arr);
        System.out.println("The array has " + k +" unique elements");
        System.out.println("The Array is : ");
        for(int i =0; i<k; i++){
            System.out.print(arr[i] + " ");
        }
    }
}