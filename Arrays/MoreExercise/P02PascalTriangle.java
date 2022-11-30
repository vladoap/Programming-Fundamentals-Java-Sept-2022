package Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int[] lastArr = new int[rows];
        for (int i = 1; i <= rows; i++) {
            int[] currentArr = new int[i];

                for (int j = 0; j < currentArr.length; j++) {
                    if (j == 0) {
                        currentArr[j] = 1;
                    } else if (j == currentArr.length - 1) {
                        currentArr[j] = 1;
                    } else {
                        currentArr[j] = lastArr[j] + lastArr[j - 1];
                    }
                    System.out.print(currentArr[j] + " ");
                }
            System.out.println();
            lastArr = currentArr;
            }
        }
    }

