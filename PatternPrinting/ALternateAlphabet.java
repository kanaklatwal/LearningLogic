import java.util.Scanner;

public class ALternateAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        for(int i=1; i<=size; i++){
            for(int j=1; j<= size; j++){
                if(i%2 == 0){
                    System.out.print((char)(i+64));
                }else{
                    System.out.print((char)(i+96));
                }
            }
            System.out.println();
        }
    }
}
