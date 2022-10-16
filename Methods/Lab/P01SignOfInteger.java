package Methods.Lab;

import java.util.Scanner;

public class P01SignOfInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        printNum(num);


    }
    public static void printNum(int num) {
        if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else if (num == 0) {
            System.out.printf("The number %d is zero.", num);
        } else {
            System.out.printf("The number %d is negative.", num);
        }
    }

}
