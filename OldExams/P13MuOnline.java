package OldExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P13MuOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         String[] dungeonRooms = scan.nextLine().split("\\|");

         int initialHealth = 100;
         int initialBitcoins = 0;
        boolean isDead = false;
        for (int i = 0; i < dungeonRooms.length; i++) {
            String currentCommand = dungeonRooms[i].split(" ")[0];
            int currentValue = Integer.parseInt(dungeonRooms[i].split(" ")[1]);
            if (currentCommand.contains("potion")) {
                int healthAfterHeal = initialHealth + currentValue;

                 if (healthAfterHeal > 100) {
                     currentValue = 100 - initialHealth;
                     initialHealth = 100;

                 } else {
                     initialHealth = healthAfterHeal;
                 }
                System.out.printf("You healed for %d hp.%n", currentValue);
                System.out.printf("Current health: %d hp.%n", initialHealth);

            } else if (currentCommand.contains("chest")) {
                initialBitcoins += currentValue;
                System.out.printf("You found %d bitcoins.%n", currentValue);
            } else {
                  initialHealth -= currentValue;
                  if (initialHealth <= 0) {
                      System.out.printf("You died! Killed by %s.%n", currentCommand);
                      System.out.printf("Best room: %d%n", i + 1);
                      isDead = true;
                      break;
                  } else {
                      System.out.printf("You slayed %s.%n", currentCommand);
                  }
            }

        }
        if (!isDead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", initialBitcoins);
            System.out.printf("Health: %d%n", initialHealth);
        }
    }
}
