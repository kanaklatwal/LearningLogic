package BitWise;

public class BitWiseOperators {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 6;
//        System.out.println( a & b);//4
//        System.out.println( a | b);//7
//        System.out.println( a ^ b);//3
//        System.out.println(~a);//-6
//          int n = 5;
//          for(int i = 1; i<=32; i++){
//              n = n<<1;
//              System.out.println(n);
//              System.out.println();
//          }
//        int n =100;
//        for(int i =1; i<=10; i++){
//            n = n>>1; //right Shift
//            System.out.println(n);
//            System.out.println();
//        }
        int n =100;
        for(int i =1; i<=10; i++){
            n = n>>>1; // Unsigned Right shift
            System.out.println(n);
            System.out.println();
        }
    }
}
