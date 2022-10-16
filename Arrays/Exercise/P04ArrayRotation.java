package Arrays.Exercise;

import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
          String firstNumInitial = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstNumInitial;
        }
        System.out.println(String.join(" ", array));
    }
}