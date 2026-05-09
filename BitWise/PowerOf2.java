package BitWise;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 5;
//        int count = 0;
//        while(n!=0){
//            if((n&1) == 1){
//                count++;
//            }
//            n = n>>1;
//        }
//        System.out.println("Set bit Count: " + count);
//        if(count == 1){
//            System.out.println("Number "+ n+ " is power of 2" );
//        }
//        else{
//            System.out.println("Not a power of 2");
//        }
        if((n & (n-1)) == 0){
            System.out.println("the number is power of 2");
        }
        else{
            System.out.println("the number is not power of 2");
        }
    }
}
