package finalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n ; i++) {
            String lineInput = scan.nextLine();
            Matcher matcher = pattern.matcher(lineInput);
            if (matcher.find()) {
                String validBarcode = matcher.group();
                String productGroup = getProductGroup(validBarcode);
                System.out.println("Product group: " + productGroup);

            } else {
                System.out.println("Invalid barcode");
            }
        }

    }

    private static String getProductGroup(String validBarcode) {
        StringBuilder sb = new StringBuilder();
        for (char symbol : validBarcode.toCharArray()) {
            if (Character.isDigit(symbol)) {
                sb.append(symbol);
            }
        }

        if (sb.toString().equals("")) {
            return "00";
        }

        return sb.toString();
    }
}
