package regularExpressions.moreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01WinningTicket_2 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

        String[] inputArr = scan.nextLine().split("[, ]+");
        String regex = "[@]{6,}|[$]{6,}|[#]{6,}|[\\^]{6,}";      // един от всичките символи с ИЛИ да се среща 6 или повече пъти [6,]
        Pattern pattern = Pattern.compile(regex);


        for (int i = 0; i < inputArr.length; i++) {
            String currentTicket = inputArr[i];
            if (currentTicket.length() == 20) {
            String leftHalf = currentTicket.substring(0, 10);
            String rightHalf = currentTicket.substring(10, 20);

            Matcher matcherLeft = pattern.matcher(leftHalf);
            Matcher matcherRight = pattern.matcher(rightHalf);


            if (matcherLeft.find() && matcherRight.find()) {
                char symbolLeft = matcherLeft.group().charAt(0);
                char symbolRight = matcherRight.group().charAt(0);
                if (symbolLeft == symbolRight) {
                    int minSize = Math.min(matcherLeft.group().length(), matcherRight.group().length());
                    if (minSize == 10) {
                        System.out.printf("ticket \"%s\" - 10%s Jackpot!%n", currentTicket, symbolRight);
                    } else {
                        System.out.printf("ticket \"%s\" - %d%s%n", currentTicket, minSize, symbolLeft);
                    }

                }
            } else {
                System.out.printf("ticket \"%s\" - no match%n", currentTicket);
            }



            } else {
                System.out.println("invalid ticket");
            }
        }
    }
}
