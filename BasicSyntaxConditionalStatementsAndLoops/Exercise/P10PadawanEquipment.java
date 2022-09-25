package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scan.nextLine());
        int countStudents = Integer.parseInt(scan.nextLine());
        double priceLightsabers = Double.parseDouble(scan.nextLine());
        double priceRobes = Double.parseDouble(scan.nextLine());
        double priceBelts = Double.parseDouble(scan.nextLine());

        double totalPriceLightsabers = Math.ceil(countStudents * 1.1) * priceLightsabers;
        double totalPriceRobes = countStudents * priceRobes;
        int countFreeBelts = countStudents / 6; // всяка 6-та Роба е безплатна, дели Int на 6.
        double totalPriceBelt = (countStudents - countFreeBelts) * priceBelts;

        double sumTotal = totalPriceLightsabers + totalPriceRobes + totalPriceBelt;

        if (amountMoney >= sumTotal) {
            System.out.printf("The money is enough - it would cost %.2flv.", sumTotal);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(sumTotal - amountMoney));
        }


    }
}
