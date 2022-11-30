package textProcessing.lab;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String replaceWord = scan.nextLine();
        String text = scan.nextLine();
        int removeIndex = text.indexOf(replaceWord);
        while (removeIndex != -1) {

           text = text.replace(replaceWord, "");
            removeIndex = text.indexOf(replaceWord);

        }
        System.out.println(text);

    }
}
