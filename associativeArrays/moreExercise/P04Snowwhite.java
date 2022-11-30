package associativeArrays.moreExercise;

import javax.sound.midi.MidiFileFormat;
import java.util.*;

public class P04Snowwhite {

    public static class Dwarf {
        private String name;
        private int physics;

        Dwarf(String name, int physics) {
            this.name = name;
            this.physics = physics;
        }

        String getName() {
            return this.name;
        }

        int getPhysics() {
            return this.physics;
        }

        void setPhysics(int physics) {
            this.physics = physics;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineInput = scan.nextLine();

        List<Dwarf> listDwarfs = new ArrayList<>();
        Map<String, List<Dwarf>> dwarfMap = new LinkedHashMap<>();
        while (!lineInput.equals("Once upon a time")) {
            String dwarfName = lineInput.split(" <:> ")[0];
            String dwarfHatColor = lineInput.split(" <:> ")[1];
            int dwarfPhysics = Integer.parseInt(lineInput.split(" <:> ")[2]);

            if (!dwarfMap.containsKey(dwarfHatColor)) {
                dwarfMap.put(dwarfHatColor, new ArrayList<>());
                dwarfMap.get(dwarfHatColor).add(new Dwarf(dwarfName, dwarfPhysics));
                lineInput = scan.nextLine();
                continue;
            }

            boolean isContainTheSameName = false;
            // Пороверка дали името го няма
            for (Map.Entry<String, List<Dwarf>> entry : dwarfMap.entrySet()) {
                for (Dwarf dwarf : entry.getValue()) {
                    if (dwarf.getName().equals(dwarfName)) {
                        isContainTheSameName = true;
                    }
                }
            }
            // добавяме дварфа, ако името го няма
            if (!isContainTheSameName) {
                dwarfMap.get(dwarfHatColor).add(new Dwarf(dwarfName, dwarfPhysics));
                lineInput = scan.nextLine();
                continue;
            }

            // продължаваме , ако името съществува някъде


            // проверка дали цвета го има
            boolean isContainSameHatColorAndName = false;

            for (Map.Entry<String, List<Dwarf>> entry : dwarfMap.entrySet()) {
                String currentHatColor = entry.getKey();

                for (Dwarf dwarf : entry.getValue()) {
                    String currentDwarfName = dwarf.getName();
                    if (currentDwarfName.equals(dwarfName) && currentHatColor.equals(dwarfHatColor)) {
                        isContainSameHatColorAndName = true;
                        break;
                    }
                }
                if (isContainSameHatColorAndName) {
                    break;
                }
            }

            if (!isContainSameHatColorAndName) {

                dwarfMap.get(dwarfHatColor).add(new Dwarf(dwarfName, dwarfPhysics));

            } else {
                dwarfMap.get(dwarfHatColor).forEach(dwarf -> {
                    if (dwarf.getName().equals(dwarfName)) {
                        if (dwarf.getPhysics() < dwarfPhysics) {
                            dwarf.setPhysics(dwarfPhysics);
                        }
                    }
                });
            }


            lineInput = scan.nextLine();

        }

        dwarfMap.entrySet().forEach(entry -> {
            entry.getValue().sort(Comparator.comparingInt(Dwarf::getPhysics).reversed()
                    .thenComparing(Dwarf::getName));
        });

//

        for (Map.Entry<String, List<Dwarf>> entry : dwarfMap.entrySet()) {
            for (Dwarf dwarf : entry.getValue()) {

            }

        }

    }
}

