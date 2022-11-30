package associativeArrays.moreExercise;

import java.util.*;

public class P05DragonArmy {
    static class Dragon {
        String name;
        int damage;
        int health;
        int armor;

        Dragon(String name, int damage, int health, int armor) {
            this.name = name;
            this.damage = damage;
            this.health = health;
            this.armor = armor;
        }

        String getName() {
            return this.name;
        }

        int getDamage() {
            return this.damage;
        }

        int getHealth() {
            return this.health;
        }

        int getArmor() {
            return this.armor;
        }

        void setDamage(int damage) {
            this.damage = damage;
        }

        void setHealth(int health) {
            this.health = health;
        }

        void setArmor(int armor) {
            this.armor = armor;
        }



    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<Double>> averageStatsMap = new LinkedHashMap<>();
        Map<String, List<Dragon>> dragonsMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n ; i++) {
            String[] lineInputArr = scan.nextLine().split(" ");
            String type = lineInputArr[0];
            String name = lineInputArr[1];
            int damage;
            int health;
            int armor;

            if (lineInputArr[2].equals("null")) {
                damage = 45;
            } else {
                damage = Integer.parseInt(lineInputArr[2]);
            }

            if (lineInputArr[3].equals("null")) {
                health = 250;
            } else {
                health = Integer.parseInt(lineInputArr[3]);
            }

            if (lineInputArr[4].equals("null")) {
                armor = 10;
            } else {
                armor = Integer.parseInt(lineInputArr[4]);
            }

            Dragon existingDragon = null;
            if (!dragonsMap.containsKey(type)) {
                dragonsMap.put(type, new ArrayList<>());
                dragonsMap.get(type).add(new Dragon(name, damage, health, armor));
                continue;
            } else {
                for (Dragon dragon : dragonsMap.get(type)) {
                    if (dragon.getName().equals(name)) {
                        existingDragon = dragon;
                        break;
                    }
                }
                if (existingDragon != null) {
                    existingDragon.setDamage(damage);
                    existingDragon.setHealth(health);
                    existingDragon.setArmor(armor);
                }
                }

            if (existingDragon == null) {
                dragonsMap.get(type).add(new Dragon(name, damage, health, armor));
            }

        }

       dragonsMap.entrySet().forEach(entry -> {
           entry.getValue().sort(Comparator.comparing(Dragon::getName));
       });

        for (Map.Entry<String, List<Dragon>> entry : dragonsMap.entrySet()) {
            String currentType = entry.getKey();
            averageStatsMap.put(currentType, new ArrayList<>());
            averageStatsMap.get(currentType).add(0, 0.00);
            averageStatsMap.get(currentType).add(1, 0.00);
            averageStatsMap.get(currentType).add(2, 0.00);
            int countDragonsCurrentType = entry.getValue().size();
            int initialDmg = 0;
            int initialHealth = 0;
            int initialArmor = 0;
            for (Dragon dragon : entry.getValue()) {
                double currentDamage = dragon.getDamage();
                averageStatsMap.get(currentType).set(0, currentDamage + initialDmg);
                initialDmg += currentDamage;

                double currentHealth = dragon.getHealth();
                averageStatsMap.get(currentType).set(1, currentHealth + initialHealth);
                initialHealth += currentHealth;

                double currentArmor = dragon.getArmor();
                averageStatsMap.get(currentType).set(2, currentArmor + initialArmor);
                initialArmor += currentArmor;
            }

            double averageDamage = averageStatsMap.get(currentType).get(0);
            double averageHealth = averageStatsMap.get(currentType).get(1);
            double averageArmor = averageStatsMap.get(currentType).get(2);

            averageStatsMap.get(currentType).set(0, averageDamage * 1.00 / countDragonsCurrentType);
            averageStatsMap.get(currentType).set(1, averageHealth * 1.00 / countDragonsCurrentType);
            averageStatsMap.get(currentType).set(2, averageArmor * 1.00 / countDragonsCurrentType);

        }

        averageStatsMap.entrySet().forEach(entry -> {
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n",
                    entry.getKey(), entry.getValue().get(0), entry.getValue().get(1), entry.getValue().get(2));

            dragonsMap.get(entry.getKey()).forEach(dragon -> {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                        dragon.getName(), dragon.getDamage(), dragon.getHealth(), dragon.getArmor());
            });
        });





    }
    }

