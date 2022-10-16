package Methods.Exercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toLowerCase();
        printCountVowels(input);
    }
    public static void printCountVowels(String text) {
        int countVowels = 0;
       for (char currentChar : text.toCharArray()) {
           if (currentChar == 'a' || currentChar == 'u' || currentChar == 'o' ||
           currentChar == 'e' || currentChar == 'i') {
               countVowels++;
           }
       }
        System.out.println(countVowels);
    }
}
