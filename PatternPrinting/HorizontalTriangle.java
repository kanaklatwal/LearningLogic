import java.util.Scanner;

public class HorizontalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
//        for(int i=size; i>=1; i--){
//            for(int j=i; j>=1; j--){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
        for(int i=1; i<=size; i++){
            for(int j=1;j<=size+1-i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
//* * * * *
//* * * *
//* * *
//* *
//*