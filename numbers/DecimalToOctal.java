
public class DecimalToOctal {
    public static void main(String[] args) {
        int n = 20;
        String octal = "";

        while (n > 0) {
            int remainder = n % 8;
            octal = remainder + octal;
            n = n / 8;
        }

        System.out.println("Octal: " + octal);
    }
}
