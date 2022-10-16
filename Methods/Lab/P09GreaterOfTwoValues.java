package Methods.Lab;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String typeOfValues = scan.nextLine();

        switch (typeOfValues) {
            case "int":
                int num1 = Integer.parseInt(scan.nextLine());
                int num2 = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(num1, num2));
                break;
            case "char":
                char char1 = scan.nextLine().charAt(0);
                char char2 = scan.nextLine().charAt(0);
                System.out.println(getMax(char1, char2));
                break;
            case "string":
                String string1 = scan.nextLine();
                String string2 = scan.nextLine();
                System.out.println(getMax(string1, string2));
                break;
        }

    }

    public static int getMax(int num1, int num2){
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static char getMax(char char1, char char2){
        if (char1 > char2) {
            return char1;
        } else {
            return char2;
        }
    }
    public static String getMax(String string1, String string2){
       if (string1.compareTo(string2) > 0) {
           return string1;
       } else if (string1.compareTo(string2) < 0) {
           return string2;
       } else {
           return string1;
       }
    }



}
