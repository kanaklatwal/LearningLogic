package ArrayProblemSolving.Part1;

public class AlternateExtreme {
    static int[] getAlternateExtreme(int[] arr){
        int[] result = new int[arr.length];
        int start = 0;
        int end = arr.length-1;
        int k = 0;
        while(start <= end){
            result[k++] = arr[start];
            start++;
            if(start <= end){
                result[k++] = arr[end];
                end--;
            }
        }
        return result;
    }

  //**
    static void printAlternate(int[] arr){
        int n = arr.length;
        int i=0;
        int j= n-1;
        while(i<=j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }
            else{
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }
    //**


    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};

        int[] ans = getAlternateExtreme(arr);

        for(int i : ans){
            System.out.print(i + " ");
        }
        System.out.println();

        //**
        printAlternate(arr);
        //**
    }

}
