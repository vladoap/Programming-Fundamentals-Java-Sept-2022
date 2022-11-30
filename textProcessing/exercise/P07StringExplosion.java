package textProcessing.exercise;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder lineInput = new StringBuilder(scan.nextLine());

        int totalExplosionSum = 0;
        for (int i = 0; i < lineInput.length() ; i++) {
            char currentSymbol = lineInput.charAt(i);

            if (currentSymbol == '>') {
                int explosionStrength = Integer.parseInt(String.valueOf(lineInput.charAt(i + 1)));
                totalExplosionSum += explosionStrength;
            } else if (totalExplosionSum > 0) {
                lineInput.deleteCharAt(i);
                totalExplosionSum--;
                i--;
            }
        }

        System.out.println(lineInput);
    }
}
