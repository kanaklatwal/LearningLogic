package numbers;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        int count = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        while(num!=0){
            int rem = num%10;
            count++;
            num = num/10;
        }
        System.out.println("the total digits in the number is "+ count);
        sc.close();
    }
}
