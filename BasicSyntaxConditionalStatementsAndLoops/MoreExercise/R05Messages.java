package BasicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class R05Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scan.nextLine());

        String result = "";

        for (int i = 0; i < countNumbers; i++) {
            String input = scan.nextLine();
            switch (input) {
                case "2":
                    result += "a";
                    break;
                case "22":
                    result += "b";
                    break;
                case "222":
                    result += "c";
                    break;
                case "3":
                    result += "d";
                    break;
                case "33":
                    result += "e";
                    break;
                case "333":
                    result += "f";
                    break;
                case "4":
                    result += "g";
                    break;
                case "44":
                    result += "h";
                    break;
                case "444":
                    result += "i";
                    break;
                case "5":
                    result += "j";
                    break;
                case "55":
                    result += "k";
                    break;
                case "555":
                    result += "l";
                    break;
                case "6":
                    result += "m";
                    break;
                case "66":
                    result += "n";
                    break;
                case "666":
                    result += "o";
                    break;
                case "7":
                    result += "p";
                    break;
                case "77":
                    result += "q";
                    break;
                case "777":
                    result += "r";
                    break;
                case "7777":
                    result += "s";
                    break;
                case "8":
                    result += "t";
                    break;
                case "88":
                    result += "u";
                    break;
                case "888":
                    result += "v";
                    break;
                case "9":
                    result += "w";
                    break;
                case "99":
                    result += "x";
                    break;
                case "999":
                    result += "y";
                    break;
                case "9999":
                    result += "z";
                    break;
                case "0":
                    result += " ";
                    break;

            }

        }
        System.out.println(result);
    }
}
