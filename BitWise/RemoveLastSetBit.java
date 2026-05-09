package BitWise;

public class RemoveLastSetBit {
    public static void main(String[] args) {
        int n = 10;//00001010
        System.out.println(n&(n-1));

    }
}