package finalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, Integer> plantRarityMap = new LinkedHashMap<>();
        Map<String, Double> plantRatingMap = new LinkedHashMap<>();
        Map<String, Integer> plantRatingCountTimes = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String input = scan.nextLine();
            String plant = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);
                plantRarityMap.put(plant,rarity);
                plantRatingMap.put(plant, 0.00);
                plantRatingCountTimes.put(plant, 0);

        }
        String lineInput = scan.nextLine();
        String regex = ":\\s(?<plant>\\w+)";
        Pattern pattern = Pattern.compile(regex);
        while (!lineInput.equals("Exhibition")) {
            if (lineInput.contains("Rate")) {
                Matcher matcher = pattern.matcher(lineInput);
                String plant = "";
                if (matcher.find()) {
                    plant = matcher.group("plant");
                }

                double rating = Double.parseDouble(lineInput.split(" - ")[1]);
                if (plantRatingMap.containsKey(plant)) {
                    double oldRating = plantRatingMap.get(plant);
                    plantRatingMap.put(plant, rating + oldRating);
                    int oldCount = plantRatingCountTimes.get(plant);
                    plantRatingCountTimes.put(plant, oldCount + 1);
                } else {
                    System.out.println("error");
                }

            } else if (lineInput.contains("Update")) {
                Matcher matcher = pattern.matcher(lineInput);

                String plant = "";
                if (matcher.find()) {
                    plant = matcher.group("plant");
                }

               int rarity = Integer.parseInt(lineInput.split(" - ")[1]);
                if (plantRarityMap.containsKey(plant)) {
                    plantRarityMap.put(plant, rarity);
                } else {
                    System.out.println("error");
                }
            } else if (lineInput.contains("Reset")) {
                Matcher matcher = pattern.matcher(lineInput);
                String plant = "";
                if (matcher.find()) {
                    plant = matcher.group("plant");
                }
                if (plantRatingMap.containsKey(plant)) {
                    plantRatingMap.put(plant, 0.00);
                } else {
                    System.out.println("error");
                }


            }


            lineInput = scan.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantRarityMap.entrySet().forEach(entry -> {
            double averageRating = plantRatingMap.get(entry.getKey()) / plantRatingCountTimes.get(entry.getKey());
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), averageRating);
        });




    }
}
