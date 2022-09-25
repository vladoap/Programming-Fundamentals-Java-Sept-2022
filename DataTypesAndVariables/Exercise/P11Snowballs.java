package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countSnowballs = Integer.parseInt(scan.nextLine());
        double snowballValueMax = Double.MIN_VALUE;
        int snowballSnowMax = 0;
        int snowballTimeMax = 0;
        int snowballQualityMax = 0;
        for (int i = 1; i <= countSnowballs; i++) {
           int snowballSnow = Integer.parseInt(scan.nextLine());
           int snowballTime = Integer.parseInt(scan.nextLine());
           int snowballQuality = Integer.parseInt(scan.nextLine());

            double snowballValue = Math.pow(((double) snowballSnow / snowballTime), snowballQuality);
            if (snowballValue >= snowballValueMax) {
                snowballValueMax = snowballValue;
                snowballQualityMax = snowballQuality;
                snowballTimeMax = snowballTime;
                snowballSnowMax = snowballSnow;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowMax, snowballTimeMax, snowballValueMax, snowballQualityMax);
    }
}
