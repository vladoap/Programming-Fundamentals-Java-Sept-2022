package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberKegs = Integer.parseInt(scan.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String biggestKeg = "";

        for (int i = 1; i <= numberKegs ; i++) {
            String modelKeg = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume >= maxVolume) {
                maxVolume = volume;
                biggestKeg = modelKeg;
            }


        }

        System.out.println(biggestKeg);
    }
}
