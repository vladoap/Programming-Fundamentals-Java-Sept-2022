package associativeArrays.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] wordsArr = Arrays
                .stream(scan.nextLine().split(" "))
                        .filter(e -> e.length() % 2 == 0)
                                .toArray(String[]::new);


        Arrays.stream(wordsArr).filter(e -> e.length() % 2 == 0).toArray();
        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}

