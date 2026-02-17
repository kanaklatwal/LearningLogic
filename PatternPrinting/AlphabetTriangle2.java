import java.util.Scanner;

public class AlphabetTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        for(int i=1; i<=size; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(i+64)+ " ");
            }
            System.out.println();
        }
    }
}
//A
//B B
//C C C
//D D D D
//E E E E E
