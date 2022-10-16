package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] inputArr = input.split(" ");
        for (int i = 0; i < inputArr.length / 2; i++) {

                String oldElement = inputArr[i];
                inputArr[i] = inputArr[inputArr.length - 1 - i];
                inputArr[inputArr.length - 1 - i] = oldElement;

            }

        System.out.println(String.join(" ", inputArr));

        }
    }

