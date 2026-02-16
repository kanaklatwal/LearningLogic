import java.util.Scanner;
public class PrintNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of size: ");
        int size = sc.nextInt();
        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
