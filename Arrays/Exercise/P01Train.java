package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] Arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            Arr[i] = Integer.parseInt(scan.nextLine());
            System.out.print(Arr[i] + " ");
            sum += Arr[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}
