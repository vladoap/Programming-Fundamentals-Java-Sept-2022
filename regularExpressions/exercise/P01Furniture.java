package regularExpressions.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+(.[0-9]+)*)!(?<quantity>[0-9]+)\\b";
        Pattern pattern = Pattern.compile(regex);
        String input = scan.nextLine();
        List<String> furnitureList = new ArrayList<>();
        double totalSum = 0;
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double totalPrice = price * quantity;
                totalSum += totalPrice;
                furnitureList.add(furniture);
            }




            input = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureList.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
