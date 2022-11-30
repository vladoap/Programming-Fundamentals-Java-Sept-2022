package Methods.Exercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        printMatrix(num);

    }
    public static void printMatrix(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print(n + " ");
            }
            System.out.println();

        }
    }
}