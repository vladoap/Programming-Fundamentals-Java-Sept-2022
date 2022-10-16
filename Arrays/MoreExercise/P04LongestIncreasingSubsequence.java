package Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] len = new int[numbersArr.length];
        int[] prev = new int[numbersArr.length];

        for (int currentIndex = 0; currentIndex < numbersArr.length; currentIndex++) {
           len[currentIndex] = 1;
            prev[currentIndex] = -1;

            for (int prevIndex = 0; prevIndex < currentIndex ; prevIndex++) {
              if (numbersArr[prevIndex] < numbersArr[currentIndex] &&
                      len[prevIndex] >= len[currentIndex]) {
                  len[currentIndex] = len[prevIndex] + 1;
                  prev[currentIndex] = prevIndex;
                }
            }
        }




    }
}
