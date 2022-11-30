package textProcessing.lab;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineInput = scan.nextLine();

        while (!lineInput.equals("end")) {
            String result = "";

            for (int i = lineInput.length() - 1; i >= 0; i--) {
                char currentSymbol = lineInput.charAt(i);
                result += currentSymbol;
            }
            System.out.println(lineInput + " = " + result);




            lineInput = scan.nextLine();
        }
    }
}
