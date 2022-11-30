package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> junkMap = new LinkedHashMap<>();

        boolean isWon = false;
        int countShards = 0;
        int countFragments = 0;
        int countMotes = 0;

        while (!isWon) {
            String[] lineInputArr = scan.nextLine().split(" ");
            for (int position = 0; position < lineInputArr.length; position += 2) {
                int quantityMaterial = Integer.parseInt(lineInputArr[position]);
                String material = lineInputArr[position + 1].toLowerCase();

                switch (material) {
                    case "shards":
                        countShards += quantityMaterial;
                        break;
                    case "fragments":
                        countFragments += quantityMaterial;
                        break;
                    case "motes":
                        countMotes += quantityMaterial;
                        break;
                    default:
                        if (!junkMap.containsKey(material)) {
                            junkMap.put(material, quantityMaterial);
                        } else {
                            int currentQuantity = junkMap.get(material);
                            junkMap.put(material, currentQuantity + quantityMaterial);
                        }
                        break;
                }
                if (countShards >= 250) {
                    System.out.printf("Shadowmourne obtained!%n");
                    countShards -= 250;
                    isWon = true;
                    break;
                } else if (countFragments >= 250) {
                    System.out.printf("Valanyr obtained!%n");
                    countFragments -= 250;
                    isWon = true;
                    break;
                } else if (countMotes >= 250) {
                    System.out.printf("Dragonwrath obtained!%n");
                    countMotes -= 250;
                    isWon = true;
                    break;
                }

            }

        }

        System.out.println("shards: " + countShards);
        System.out.println("fragments: " + countFragments);
        System.out.println("motes: " + countMotes);
        junkMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
