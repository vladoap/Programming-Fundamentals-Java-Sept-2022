package Methods.Exercise;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        printTheSmallestNumber(num1, num2, num3);

    }
    public static void printTheSmallestNumber(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            System.out.println(n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }
    }
}
