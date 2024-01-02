import java.util.Scanner;
import java.math.BigInteger;

public class HugeNumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        BigInteger bigInt1 = new BigInteger(num1);
        BigInteger bigInt2 = new BigInteger(num2);
        BigInteger sum = bigInt1.add(bigInt2);
        BigInteger product = bigInt1.multiply(bigInt2);
        System.out.println(sum);
        System.out.println(product);
        scanner.close();
    }
}
