package Methods.Exercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        int sumNumbers = sumNums(num1, num2);
        int subNumbers = subNums(sumNumbers, num3);
        System.out.println(subNumbers);
    }

    public static int sumNums(int n1 , int n2) {
        return n1 + n2;
    }
    public static int subNums(int n1, int n2) {
        return n1 - n2;
    }
}
