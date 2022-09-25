package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        boolean isBalanced = true;
        int countNested = 0;
        for (int i = 1; i <= n ; i++) {
            String input = scan.nextLine();
            if (input.length() == 1) {
                    if (input.charAt(0) == '(') {
                        isBalanced = false;
                        countNested++;

                    } else if (input.charAt(0) == ')') {
                        isBalanced = true;
                        countNested--;
                    }

                }
            if (countNested > 1 || countNested < 0) {
                isBalanced = false;
                 break;
            }
            }



        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

    }
}
