package OldExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P12MovingTarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> targetSequence = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("End")) {
            String[] commandArr = command.split("\\s+");
            String currentCommand = commandArr[0];
            int index = Integer.parseInt(commandArr[1]);
            int value = Integer.parseInt(commandArr[2]);

            switch (currentCommand) {
                case "Shoot":
                    shootTarget(targetSequence, index, value);
                    break;
                case "Add":
                    addTarget(targetSequence, index, value);
                    break;
                case "Strike":
                    strikeTarget(targetSequence, index, value);
                    break;
            }
            command = scan.nextLine();
        }
        if (!targetSequence.isEmpty()) {
            System.out.println(targetSequence.toString().replaceAll("[\\[\\],]", "")
                    .replace(" ", "|"));
        }

    }
    public static List<Integer> shootTarget (List<Integer> targets, int index, int power) {
        boolean isValid = false;
        if (index >= 0 && index < targets.size()) {
            isValid = true;
        }
        if (isValid) {
            int currentTarget = targets.get(index);
            targets.set(index, currentTarget - power);
            if (targets.get(index) <= 0) {
                targets.remove(index);
            }
        }
        return  targets;
    }

    public static List<Integer> addTarget (List<Integer> targets, int index, int value) {
        boolean isValid = false;
        if (index >= 0 && index < targets.size()) {
            isValid = true;
        }
        if (isValid) {
            targets.add(index, value);
        } else {
            System.out.println("Invalid placement!");
        }
        return  targets;
    }

    public static List<Integer> strikeTarget (List<Integer> targets, int index, int radius) {
        boolean isValid = false;

                if (index - radius >= 0 && index + radius < targets.size()) {
                    isValid = true;
        }

        if (isValid) {
            targets.subList(index - radius, index + radius + 1).clear();
          //  targets.removeAll(targets.subList(index - radius, index + radius + 1));
         //   targets.removeAll(targets.subList(index - radius, index + 1));
        } else {
            System.out.println("Strike missed!");
        }
        return  targets;
    }
}
