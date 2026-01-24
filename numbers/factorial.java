package numbers;
import java.util.*;
public class factorial {
    public static int factorialNum(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();
        int factorial = factorialNum(num);
        System.out.println("The factorial of "+num+ " is " + factorial);
        sc.close();
    }
}
