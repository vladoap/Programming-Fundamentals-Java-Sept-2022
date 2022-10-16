package Arrays.MoreExercise;

import java.util.Scanner;

public class P03RecursiveFibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberFib = Integer.parseInt(scan.nextLine());
        int[] previousNumArr = new int[numberFib];
        for (int i = 1; i <= numberFib ; i++) {
            int[] currentNumArr = new int[i];
            if (i == 1) {
                currentNumArr[i - 1] = 1;
            } else if (i == 2){
                currentNumArr[i - 1] = 1;
                currentNumArr[i - 2] = 1;
            } else {
                currentNumArr[i - 1] = previousNumArr[i - 2] + previousNumArr[i - 3];
                currentNumArr[i - 2] = previousNumArr[i - 2];
            }
            previousNumArr = currentNumArr;
        }
        System.out.println(previousNumArr[previousNumArr.length - 1]);
    }
}
