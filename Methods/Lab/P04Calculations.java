package Methods.Lab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        switch (command) {
            case "add":
                addNums(num1, num2);
                break;
            case "multiply":
                multiplyNums(num1, num2);
                break;
            case "subtract":
                subtractNums(num1, num2);
                break;
            case "divide":
                divideNums(num1, num2);
                    break;

        }
    }
    public static void addNums(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public static void multiplyNums(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    public static void subtractNums(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    public static void divideNums(int num1, int num2) {
        System.out.println(num1 / num2);
    }
}
