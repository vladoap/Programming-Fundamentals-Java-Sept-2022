package Arrays.Exercise;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] Array1 = new String[n];
        String[] Array2 = new String[n];
        for (int i = 1; i <= n ; i++) {
            String[] inputArr = scan.nextLine().split(" ");

            if (i % 2 == 0) {
                Array1[i - 1] = inputArr[1];
                Array2[i - 1] = inputArr[0];
            } else {
                Array1[i - 1] = inputArr[0];
                Array2[i - 1] = inputArr[1];
            }
        }
        System.out.println(String.join(" ", Array1));
        System.out.println(String.join(" ", Array2));
    }
}
