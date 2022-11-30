package exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> nameList = Arrays
                .stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scan.nextLine();
       int countBlacklisted = 0;
       int countLostNames = 0;
        while (!command.equals("Report")) {
            if (command.contains("Blacklist")) {
                 String currentName = command.split(" ")[1];
                 int indexCurrentName = nameList.indexOf(currentName);
                 if (nameList.contains(currentName)) {
                     nameList.set(indexCurrentName, "Blacklisted");
                     System.out.printf("%s was blacklisted.%n", currentName);
                     countBlacklisted++;
                 } else {
                     System.out.printf("%s was not found.%n", currentName);
                 }
            } else if (command.contains("Error")) {
                int index = Integer.parseInt(command.split(" ")[1]);

                if (index >= 0 && index < nameList.size()) {
                    String currentName = nameList.get(index);
                    if (!currentName.equals("Blacklisted") && !currentName.equals("Lost")) {
                        nameList.set(index, "Lost");
                        System.out.printf("%s was lost due to an error.%n", currentName);
                        countLostNames++;
                    }
                }

            } else if (command.contains("Change")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                String newName = command.split(" ")[2];
                if (index >= 0 && index < nameList.size()) {
                    String oldName = nameList.get(index);
                    nameList.set(index, newName);
                    System.out.printf("%s changed his username to %s.%n", oldName, newName);
                }
                }
            command = scan.nextLine();
            }

        System.out.printf("Blacklisted names: %d%n", countBlacklisted);
        System.out.printf("Lost names: %d%n", countLostNames);
        System.out.println(String.join(" ", nameList));
        }
    }

