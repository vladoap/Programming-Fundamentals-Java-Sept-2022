package associativeArrays.lab;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,List<String>> wordsMap = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String word = scan.nextLine();
            String synonyms = scan.nextLine();

            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, new ArrayList<>());
                wordsMap.get(word).add(synonyms);
            } else {
                wordsMap.get(word).add(synonyms);
            }
        }

        for (Map.Entry<String, List<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }




    }
}
