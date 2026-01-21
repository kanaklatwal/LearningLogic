import java.util.Scanner;
public class sumOfNumber {
    public static int SumNumber(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = SumNumber(num);
        System.out.println("The sum of "+ num +" numbers is " + sum);
        sc.close();
    }
}
