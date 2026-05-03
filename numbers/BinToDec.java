package numbers;
import java.util.Scanner;
import static java.lang.Math.pow;
public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n: ");
        n = sc.nextInt();
        int ans = 0;
        int i = 0;
        while( n!= 0){
            int digit = n%10;
            if(digit == 1){
                ans = (int) (ans + pow(2,i));
            }
            n =n / 10;
            i++;
        }
        System.out.println(ans);
    }
}
