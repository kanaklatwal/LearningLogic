package numbers;
import java.util.Scanner;

public class reverse{
    public static int reverseNumber(int num){
        int rem;
        int digit = 0;
        while(num!=0){
            rem = num%10;
            digit = digit*10 + rem;
            num = num/10;
         }
         return digit;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        System.out.println("The reversed number of "+n+" is "+ reverseNumber(n));
    }
}