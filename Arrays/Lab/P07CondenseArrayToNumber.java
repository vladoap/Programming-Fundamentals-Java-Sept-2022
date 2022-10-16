package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] inputArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] condensedArr = new int[inputArr.length - 1];
        for (int i = 0; i < inputArr.length ; i++) {
            if (inputArr.length == 1) {
                break;
            }
            if (i == inputArr.length - 1) {
                int[] condensedNew = new int[condensedArr.length - 1];
                i = - 1;
                inputArr = condensedArr;
                condensedArr = condensedNew;

            } else {
                condensedArr[i] = inputArr[i] + inputArr[i + 1];
            }

        }
        System.out.println(inputArr[0]);

    }
}
