package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sumLiters = 0;
        for (int i = 1; i <= n ; i++) {
            int input = Integer.parseInt(scan.nextLine());
            if (input <= (255 - sumLiters)) {
                sumLiters += input;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sumLiters);

    }
}
