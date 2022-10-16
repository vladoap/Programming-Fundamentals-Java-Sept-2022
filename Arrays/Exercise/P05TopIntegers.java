package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] inputArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <= inputArr.length - 1; i++) {
            if ( i == inputArr.length - 1) {
                System.out.print(inputArr[i] + " ");
                break;
            }
            boolean isTop = false;
            for (int j = i + 1; j < inputArr.length ; j++) {

               if (inputArr[i] > inputArr[j]) {
                       isTop = true;
                } else {
                   isTop = false;
                   break;
               }
            }
            if (isTop) {
                System.out.print(inputArr[i] + " ");
            }

        }

        }
    }

