package Methods.Exercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        if (isEnoughLength(password) && isAtLeastTwoDigits(password) && isContainingLettersAndDigits(password)) {
            System.out.println("Password is valid");
        } else {
            if (!isEnoughLength(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!isContainingLettersAndDigits(password)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!isAtLeastTwoDigits(password)) {
                System.out.println("Password must have at least 2 digits");
            }
        }
    }

    public static boolean isEnoughLength(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isContainingLettersAndDigits(String password) {
        String pass = password.toLowerCase();
        boolean isValid = true;
        for (char currSymbol : pass.toCharArray()) {
            if ((currSymbol >= 48 && currSymbol <= 57) || (currSymbol >= 97 && currSymbol <= 122)) {
                isValid = true;
            } else {
                isValid = false;
                break;
            }
        }
        return isValid;

    }
    public static boolean isAtLeastTwoDigits(String password) {
        int countDigits = 0;
        for (char currSymbol : password.toCharArray()) {
            if (currSymbol >= 48 && currSymbol <= 57) {
                countDigits++;
            }
        }
        if (countDigits >= 2) {
            return true;
        } else {
            return false;
        }
    }
}


