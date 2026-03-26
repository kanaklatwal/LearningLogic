import java.util.Scanner;

public class palindromeNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int rem = 0;
        int original = num;
        while(num>0){
           int digit = num%10;
           rem = rem*10+digit;
           num = num/10;
        }
        System.out.println("the reversed number is " + rem);
        if(rem==original){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
        sc.close();
    }
}
