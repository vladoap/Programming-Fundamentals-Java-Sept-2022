package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] inputArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean indexExists = false;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr.length == 1) {
                System.out.println(0);
                break;
            }
            int sumLeft = 0;
            int sumRight = 0;
            // намиране на числа от дясната страна
            for (int j = i + 1; j < inputArr.length; j++) {
                sumRight += inputArr[j];
            }
            // намиране на числа от лява страна
            for (int k = 0; k < i ; k++) {
                sumLeft += inputArr[k];
            }

            if (sumLeft == sumRight) {
                System.out.println(i);
                indexExists = true;
                break;
            }

        }
        if (!indexExists && inputArr.length != 1) {
            System.out.println("no");
        }
    }
}
