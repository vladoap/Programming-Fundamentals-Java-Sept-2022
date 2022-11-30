package regularExpressions.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]+)%([^|$%.]*)<(?<product>\\w+)>([^|$%.]*)\\|(?<count>[0-9]+)\\|([^|$%.0-9]*)(?<price>[0-9]+.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);
        String input = scan.nextLine();

     double totalSum = 0;
        while (!input.equals("end of shift")) {
          Matcher matcher = pattern.matcher(input);
          while (matcher.find()) {
              String name = matcher.group("name");
              String product = matcher.group("product");
              int count = Integer.parseInt(matcher.group("count"));
              double price = Double.parseDouble(matcher.group("price"));
              double totalPrice = count * price;
              totalSum += totalPrice;

              System.out.printf("%s: %s - %.2f%n", name, product, totalPrice);

          }
            input = scan.nextLine();
        }
        System.out.printf("Total income: %.2f", totalSum);
    }
}
