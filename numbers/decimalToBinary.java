
public class decimalToBinary {
    public static void main(String[] args) {
        int n = 13;
        String binary = "";

        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }

        System.out.println("Binary: " + binary);
    }
}

