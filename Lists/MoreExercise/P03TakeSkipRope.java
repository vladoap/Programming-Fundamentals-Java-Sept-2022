package Lists.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Integer> numbers = new ArrayList<>();
        List<String> text = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        extractLists(input, numbers, text);
        extractTakeAndSkipList(numbers, takeList, skipList);

        String result = "";

        int beginIndex = 0;
        for (int i = 0; i < takeList.size() ; i++) {
            int currentTakeNumber = takeList.get(i);
            int currentSkipNumber = skipList.get(i);

            if (currentTakeNumber > 0) {
                if (currentTakeNumber + beginIndex >= text.size()) {
                    result += text.subList(beginIndex, text.size());
                    break;
                } else {
                    result += text.subList(beginIndex, beginIndex + currentTakeNumber).toString();
                    beginIndex += currentTakeNumber;
                }
            }
            if (currentSkipNumber > 0) {
                beginIndex += currentSkipNumber;
            }

        }



        System.out.println(result.replaceAll("[\\[\\],]", "")
                 .trim()
                .replaceAll("  ", "KUR")
                .replaceAll(" ", "")
                .replaceAll("KUR", " "));

    }

    private static void extractTakeAndSkipList(List<Integer> numbers, List<Integer> takeList, List<Integer> skipList) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numbers.get(i));
            } else if (i % 2 != 0) {
                skipList.add(numbers.get(i));
            }
        }
    }

    private static void extractLists(String input, List<Integer> numbers, List<String> text) {
        for (int i = 0; i < input.length() ; i++) {
            if (input.charAt(i) > 47 && input.charAt(i) < 58 ) {
                int currentNumber = Integer.parseInt(Character.toString(input.charAt(i)));
                numbers.add(currentNumber);
            } else {
                text.add(Character.toString(input.charAt(i)));
            }
        }
    }
}
