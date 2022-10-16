package Arrays.Lab;

import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] inputArr = input.split(" ");

        int[] inputArrInt = new int[inputArr.length];

        int sum = 0;
        for (int i = 0; i < inputArr.length; i++) {
            inputArrInt[i] = Integer.parseInt(inputArr[i]);
            if (inputArrInt[i] % 2 == 0) {
                sum += inputArrInt[i];
            }
        }
        System.out.println(sum);

    }
}
