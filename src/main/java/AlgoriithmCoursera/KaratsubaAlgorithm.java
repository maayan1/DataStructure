package AlgoriithmCoursera;

import java.math.BigInteger;
import java.util.Scanner;

public class KaratsubaAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two numbers as strings
        System.out.print("Enter the first number: ");
        String num1 = scanner.next();

        System.out.print("Enter the second number: ");
        String num2 = scanner.next();

        // Convert the input strings to BigIntegers
        BigInteger x = new BigInteger(num1);
        BigInteger y = new BigInteger(num2);

        // Calculate the product using Karatsuba's algorithm
        BigInteger product = karatsuba(x, y);

        // Output the product
        System.out.println("Product: " + product);

        scanner.close();
    }

    public static BigInteger karatsuba(BigInteger x, BigInteger y) {
        // Base case: If the numbers are small, just multiply and return
        if (x.compareTo(BigInteger.TEN) == -1 || y.compareTo(BigInteger.TEN) == -1) {
            return x.multiply(y);
        }

        // Calculate the number of digits
        int size = Math.max(x.toString().length(), y.toString().length());

        // Split the numbers into halves
        int half = (size + 1) / 2;
        BigInteger power = BigInteger.TEN.pow(half);

        BigInteger[] xParts = x.divideAndRemainder(power);
        BigInteger a = xParts[0];
        BigInteger b = xParts[1];

        BigInteger[] yParts = y.divideAndRemainder(power);
        BigInteger c = yParts[0];
        BigInteger d = yParts[1];

        // Recursive steps
        BigInteger ac = karatsuba(a, c);
        BigInteger bd = karatsuba(b, d);
        BigInteger ad_plus_bc = karatsuba(a.add(b), c.add(d)).subtract(ac).subtract(bd);

        // Combine the results
        return ac.multiply(power.pow(2)).add(ad_plus_bc.multiply(power)).add(bd);
    }
}
