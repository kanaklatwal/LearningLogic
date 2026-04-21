package Arrays.searching;

public class sqrtInteger {

    public static int binarySearch(int x){
        long s = 0;
        long e = x;
        long mid = s + (e-s)/2;
        long ans = -1;
        while(s<=e){
            long square = mid*mid;
            if (square == x){
                return (int)mid;
            }
            if(square < x){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s + (e-s)/2;
        }
        return (int)ans;
    }

    public static int sqrt(int x){
        return binarySearch(x);
    }

    public static double morePrecision(int n, int precision, int tempSol){
        double factor = 1;
        double ans = tempSol;
        for(int i=0; i< precision; i++){
            factor = factor/10;
            for(double j=ans; j*j< n; j=j+factor){
                  ans = j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 85;
        int tempSol = sqrt(num);
        System.out.println("the sqaure root of "+ num + " is: " + tempSol);
        System.out.println("answer is "+ morePrecision(num, 3,tempSol));
    }
}
