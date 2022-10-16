package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] numbersArr = new int[n];
        for (int i = numbersArr.length - 1; i >= 0 ; i--) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            numbersArr[i] = currentNumber;
        }

        for (int i = 0; i < numbersArr.length  ; i++) {
            System.out.print(numbersArr[i] + " ");


        }
    }
}
