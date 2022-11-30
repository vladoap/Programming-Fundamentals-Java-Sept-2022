package textProcessing.moreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder decryptedText = new StringBuilder();
        String lineInput = scan.nextLine();
        String[] lineInputArr = lineInput.split("\\s+");

        for (int i = 0; i < lineInputArr.length ; i++) {

            String currentLetter = "";
            switch (lineInputArr[i]) {
                case ".-":
                    currentLetter = "A";
                    break;
                case "-....":
                    currentLetter = "B";
                    break;
                case "-.-.":
                    currentLetter = "C";
                    break;
                case "-..":
                    currentLetter = "D";
                    break;
                case ".":
                    currentLetter = "E";
                    break;
                case "..-.":
                    currentLetter = "F";
                    break;
                case "--.":
                    currentLetter = "G";
                    break;
                case "....":
                    currentLetter = "H";
                    break;
                case "..":
                    currentLetter = "I";
                    break;
                case ".---":
                    currentLetter = "J";
                    break;
                case "-.-":
                    currentLetter = "K";
                    break;
                case ".-..":
                    currentLetter = "L";
                    break;
                case "--":
                    currentLetter = "M";
                    break;
                case "-.":
                    currentLetter = "N";
                    break;
                case "---":
                    currentLetter = "O";
                    break;
                case ".--.":
                    currentLetter = "P";
                    break;
                case "--.-":
                    currentLetter = "Q";
                    break;
                case ".-.":
                    currentLetter = "R";
                    break;
                case "...":
                    currentLetter = "S";
                    break;
                case "-":
                    currentLetter = "T";
                    break;
                case "..-":
                    currentLetter = "U";
                    break;
                case "...-":
                    currentLetter = "V";
                    break;
                case ".--":
                    currentLetter = "W";
                    break;
                case "-..-":
                    currentLetter = "X";
                    break;
                case "-.--":
                    currentLetter = "Y";
                    break;
                case "--..":
                    currentLetter = "Z";
                    break;
                case "|":
                    currentLetter = " ";
                    break;
            }
           decryptedText.append(currentLetter);
        }

        System.out.println(decryptedText);

    }
}
