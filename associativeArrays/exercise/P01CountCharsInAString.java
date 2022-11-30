package associativeArrays.exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()) {

            if (symbol != ' ') {
                if (!map.containsKey(symbol)) {
                    map.put(symbol, 1);
                } else {
                    int currentValue = map.get(symbol);
                    map.put(symbol, currentValue + 1);
                }
            }
        }
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
