package Methods.MoreExercise;

import java.util.Scanner;

public class P04TribonacciSequence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberFib = Integer.parseInt(scan.nextLine());
        int[] numArr = new int[numberFib];


            if (numberFib == 1) {
                numArr[0] = 1;
            } else if (numberFib == 2){
                numArr[0] = 1;
                numArr[1] = 1;
            } else if (numberFib == 3) {
                numArr[2] = 2;
                numArr[1] = 1;
                numArr[0] = 1;
            } else {
                numArr[2] = 2;
                numArr[1] = 1;
                numArr[0] = 1;
                for (int i = 3; i < numberFib ; i++) {
                    numArr[i] = numArr[i - 1] + numArr[i - 2] + numArr[i - 3];
                }
            }
        for (int item : numArr) {
            System.out.print(item + " ");
        }


    }
}
