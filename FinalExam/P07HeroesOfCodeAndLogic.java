package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberHeroes = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> healthMap = new LinkedHashMap<>();
        Map<String, Integer> manaMap = new LinkedHashMap<>();
        for (int i = 1; i <= numberHeroes ; i++) {
            String[] heroData = scanner.nextLine().split("\\s+");
            String name = heroData[0];
            int hp = Integer.parseInt(heroData[1]);
            int mp = Integer.parseInt(heroData[2]);
            healthMap.put(name, hp);
            manaMap.put(name, mp);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] heroData = command.split("\\s+-\\s+");
            String name = heroData[1];
            if (command.contains("CastSpell")) {
                int  mp = Integer.parseInt(heroData[2]);
                String spellName = heroData[3];
                if (manaMap.get(name) >= mp) {
                    int manaLeft = manaMap.get(name) - mp;
                    manaMap.put(name, manaLeft);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", name, spellName, manaLeft);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", name, spellName);
                }
            } else if (command.contains("TakeDamage")) {
                int damage = Integer.parseInt(heroData[2]);
                String attacker = heroData[3];

                if (healthMap.get(name) - damage > 0) {
                    int hpLeft = healthMap.get(name) - damage;
                    healthMap.put(name, hpLeft);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", name, damage, attacker, hpLeft);
                } else {
                    System.out.printf("%s has been killed by %s!%n", name, attacker);
                    healthMap.remove(name);
                    manaMap.remove(name);
                }

            } else if (command.contains("Recharge")) {
                int amount = Integer.parseInt(heroData[2]);
                int currentMana = manaMap.get(name);
                int rechargedMana = 0;
                if (currentMana + amount > 200) {
                    rechargedMana = 200 - currentMana;
                    manaMap.put(name, 200);
                } else {
                    rechargedMana = amount;
                    manaMap.put(name, currentMana + amount);
                }
                System.out.printf("%s recharged for %d MP!%n", name, rechargedMana);
            } else if (command.contains("Heal")) {
                int amount = Integer.parseInt(heroData[2]);
                int currentHealth = healthMap.get(name);
                int rechargedHealth = 0;
                if (currentHealth + amount > 100) {
                    rechargedHealth = 100 - currentHealth;
                    healthMap.put(name, 100);
                } else {
                    rechargedHealth = amount;
                    healthMap.put(name, currentHealth + amount);
                }
                System.out.printf("%s healed for %d HP!%n", name, rechargedHealth);

            }

            command = scanner.nextLine();
        }

        healthMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(" HP: " + entry.getValue());
            System.out.println(" MP: " + manaMap.get(entry.getKey()));
        });
    }
}
