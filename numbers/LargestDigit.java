package numbers;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int max = 0;
        while(num!=0){
            if(num%10>max){
                max = num%10;
            }
            num=num/10;
        }
        System.out.println(max + " is the maximum digit");
        sc.close();
    }
}
