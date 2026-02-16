import java.util.Scanner;

public class smallAlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of size: ");
        int size = sc.nextInt();
        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
                System.out.print((char)(j+ 96) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
