import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        for(int i=1; i<=size; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println();
        }
    }
}
