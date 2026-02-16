import java.util.Scanner;

public class SquareWithSameAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        for(int i=1; i<=size; i++){
            for(int j=1; j<= size; j++){
                System.out.print((char)(i + 64) + " ");
            }
            System.out.println();
        }
    }
}
