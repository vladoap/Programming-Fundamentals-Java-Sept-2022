package regularExpressions.moreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01WinningTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regexSide = "([@#$^])\\1\\1\\1\\1\\1+";
        String regexJackpot = "([@#$^])\\1\\1\\1\\1\\1\\1\\1\\1\\1";
        String regexSixTimes = "([@#$^])\\1\\1\\1\\1\\1";
        String regexSevenTimes = "([@#$^])\\1\\1\\1\\1\\1\\1";
        String regexEightTimes = "([@#$^])\\1\\1\\1\\1\\1\\1\\1";
        String regexNineTimes = "([@#$^])\\1\\1\\1\\1\\1\\1\\1\\1";

        // алтернатива
        // String regex = "[@]{6,}|[$]{6,}|[#]{6,}|[\^]{6,}"


        Pattern patternSide = Pattern.compile(regexSide);
        Pattern patternJackpot = Pattern.compile(regexJackpot);
        Pattern patternSixTimes = Pattern.compile(regexSixTimes);
        Pattern patternSevenTimes = Pattern.compile(regexSevenTimes);
        Pattern patternEightTimes = Pattern.compile(regexEightTimes);
        Pattern patternNineTimes = Pattern.compile(regexNineTimes);


        String[] inputArr = scan.nextLine().split("[, ]+");

        for (int i = 0; i < inputArr.length ; i++) {
            String currentTicket = inputArr[i];
            boolean isValid = currentTicket.length() == 20;
            if (isValid) {
                String leftHalf = currentTicket.substring(0, 10);
                String rightHalf = currentTicket.substring(10, 20);
//                StringBuilder leftHalf = new StringBuilder();
//                StringBuilder rightHalf = new StringBuilder();
//                for (int j = 0; j <= 9 ; j++) {
//                    leftHalf.append(currentTicket.charAt(j));
//                }
//                for (int j = 10; j <= 19 ; j++) {
//                    rightHalf.append(currentTicket.charAt(j));
//                }

                Matcher matcherLeft = patternJackpot.matcher(leftHalf);
                Matcher matcherRight = patternJackpot.matcher(rightHalf);
                if (matcherLeft.find() && matcherRight.find()) {
                   char symbol = currentTicket.charAt(0);
                    System.out.printf("ticket \"%s\" - 10%s Jackpot!%n", currentTicket, symbol);
                    continue;
                }

                matcherLeft = patternNineTimes.matcher(leftHalf);
                matcherRight = patternNineTimes.matcher(rightHalf);
                if (matcherLeft.find() && matcherRight.find()) {
                    char matchedSymbol = matcherLeft.group().charAt(0);
                    System.out.printf("ticket \"%s\" - 9%s%n", currentTicket, matchedSymbol);
                    continue;
                }

                matcherLeft = patternEightTimes.matcher(leftHalf);
                matcherRight = patternEightTimes.matcher(rightHalf);
                if (matcherLeft.find() && matcherRight.find()) {
                    char matchedSymbol = matcherLeft.group().charAt(0);
                    System.out.printf("ticket \"%s\" - 8%s%n", currentTicket, matchedSymbol);
                    continue;
                }

                matcherLeft = patternSevenTimes.matcher(leftHalf);
                matcherRight = patternSevenTimes.matcher(rightHalf);
                if (matcherLeft.find() && matcherRight.find()) {
                    char matchedSymbol = matcherLeft.group().charAt(0);
                    System.out.printf("ticket \"%s\" - 7%s%n", currentTicket, matchedSymbol);
                    continue;
                }

                matcherLeft = patternSixTimes.matcher(leftHalf);
                matcherRight = patternSixTimes.matcher(rightHalf);
                if (matcherLeft.find() && matcherRight.find()) {
                    char matchedSymbol = matcherLeft.group().charAt(0);
                    System.out.printf("ticket \"%s\" - 6%s%n", currentTicket, matchedSymbol);
                    continue;
                }



                System.out.printf("ticket \"%s\" - no match%n", currentTicket);


                } else {
                System.out.printf("invalid ticket%n");
            }

                    }
                }

                }


