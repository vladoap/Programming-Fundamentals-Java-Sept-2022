package associativeArrays.lab;

import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] wordsArr = scan.nextLine().split(" ");

        Map<String, Integer> wordMap = new LinkedHashMap<>();

        for (String word : wordsArr) {
            String currentWord = word.toLowerCase();
            if (!wordMap.containsKey(currentWord)) {
                wordMap.put(currentWord, 1);
            } else {
                int value = wordMap.get(currentWord);
                wordMap.put(currentWord, value + 1);
            }
        }

        List<String> oddWords = new ArrayList<>();
        for (Map.Entry<String,Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddWords.add(entry.getKey());
            }
        }

//
        System.out.println(String.join(", ", oddWords));

    }
}
