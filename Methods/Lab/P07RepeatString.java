package Methods.Lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());

        String result = repeatString(input, n);
        System.out.println(result);


    }
    public static String repeatString(String text, int repeatTimes){
        String result = "";
        for (int i = 1; i <= repeatTimes ; i++) {
            result += text;
        }
        return result;
    }
}
