package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equals("END")) {

            try {
                int intValue = Integer.parseInt(input);
                System.out.printf("%s is integer type%n", input);
            } catch (Exception a) {
                try {
                    double doubleValue = Double.parseDouble(input);
                    System.out.printf("%s is floating point type%n", input);
                } catch (Exception b) {
                    if (input.equals("false") || input.equals("true")) {
                        System.out.printf("%s is boolean type%n", input);
                    } else if (input.length() == 1) {
                        System.out.printf("%s is character type%n", input);
                    } else {
                        System.out.printf("%s is string type%n", input);
                    }
                }
            }



            input = scan.nextLine();
                }
            }


        }



