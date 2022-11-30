package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02MinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputLine = scan.nextLine();
        Map<String, Integer> resourcesMap = new LinkedHashMap<>();

        int countLines = 1;
        String currentResource = "";
        while (!inputLine.equals("stop")) {
            if (countLines % 2 != 0) {
                // получаваме ресурс
                currentResource = inputLine;
                if (!resourcesMap.containsKey(currentResource)) {
                    // ако не съдържа такъв ресурс - Добавяме в мапа
                    resourcesMap.put(currentResource, 0);
                }
            } else {
                // получаваме количество от ресурс - Добавяме го към съответняи ресурс
                int quantityToAdd = Integer.parseInt(inputLine);
                int currentQuantity = resourcesMap.get(currentResource);
                resourcesMap.put(currentResource, currentQuantity + quantityToAdd);
            }

            countLines++;
            inputLine = scan.nextLine();
        }

        resourcesMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
