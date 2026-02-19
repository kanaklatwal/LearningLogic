
public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 1101;
        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary = binary / 10;
        }

        System.out.println("Decimal: " + decimal);
    }
}

