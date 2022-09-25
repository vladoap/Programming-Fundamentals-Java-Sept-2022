package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pokePower = Integer.parseInt(scan.nextLine());
        int distance = Integer.parseInt(scan.nextLine());
        int factor = Integer.parseInt(scan.nextLine());

        int initialPokePower = pokePower;
        int countTargets = 0;

        while (pokePower >= distance) {
            pokePower -= distance;
            countTargets++;

            if (pokePower == initialPokePower / 2.00) {
                if (factor != 0) {
                    pokePower = pokePower / factor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(countTargets);
    }
}
