package numbers;
import java.util.Scanner;
import static java.lang.Math.pow;

import static java.lang.Math.pow;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n: ");
        n = sc.nextInt();
        int ans = 0;
        int i=0;
        while( n!= 0){
            int bit = n&1;
            ans = (int) ((bit*pow(10,i)) + ans);
            n = n>>1;
            i++;
        }
        System.out.println("Answer is: " + ans);
    }

}
