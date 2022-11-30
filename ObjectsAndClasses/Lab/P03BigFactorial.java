package ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class P03BigFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int num = Integer.parseInt(scan.nextLine());
        BigInteger factorial = BigInteger.valueOf(1);

        for (int i = 1; i <= num; i++) {
            BigInteger currentNum = BigInteger.valueOf(i);
          factorial = factorial.multiply(currentNum);

        }
        System.out.println(factorial);
    }
}
