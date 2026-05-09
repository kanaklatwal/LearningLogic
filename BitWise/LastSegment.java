package BitWise;

public class LastSegment {// last set bit
    public static void main(String[] args) {
        int n = 10;// 00001010
        System.out.println( n & -n);
        //Output: 00000010
        // -n => 2's compliment
        // 10 & -10 (-10 = 11110101 + 1 (for 2's compliment))
        // (how?)  00001010 & 11110101
    }
}
