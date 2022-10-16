package Methods.Exercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equals("END")) {

            System.out.println(isPalindrome(input));

            input = scan.nextLine();
        }
    }

    public static boolean isPalindrome(String num) {
        String straightNum = num;
        String reverseNum = "";
        for (int i = straightNum.length() - 1; i >= 0; i--) {
            reverseNum += straightNum.charAt(i);
        }
        return straightNum.equals(reverseNum);
    }
}

