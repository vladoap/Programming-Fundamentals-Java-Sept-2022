package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         String countryName = scan.nextLine();

         switch (countryName) {
             case "USA":
             case "England":
                 System.out.println("English");
             break;
             case "Spain":
             case "Argentina":
             case "Mexico":
                 System.out.println("Spanish");
                 break;
             default:
                 System.out.println("unknown");
                 break;


         }
    }
}
