package textProcessing.exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        BigInteger firstNum = new BigInteger(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());

        System.out.println(firstNum.multiply(BigInteger.valueOf(secondNum)));
    }
}
