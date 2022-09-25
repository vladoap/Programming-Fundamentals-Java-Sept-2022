package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       char input = scan.nextLine().charAt(0);

       if (Character.isUpperCase(input)) {
           System.out.println("upper-case");
       } else {
           System.out.println("lower-case");
       }
    }
}
