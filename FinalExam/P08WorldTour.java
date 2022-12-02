package FinalExam;

import java.util.Scanner;

public class P08WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();
        StringBuilder sb = new StringBuilder(lineInput);
        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            if (command.contains("Add")) {
                int index = Integer.parseInt(command.split(":")[1]);
                String city = command.split(":")[2];
                if (index >= 0 && index < sb.length()) {
                    sb.insert(index, city);

                }
                System.out.println(sb);

            } else if (command.contains("Remove")) {
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);
                boolean isValid = (startIndex >= 0 && startIndex < sb.length())
                        && (endIndex >= 0 && endIndex < sb.length());

                if (isValid) {
                     sb.replace(startIndex, endIndex + 1, "");

                }
                System.out.println(sb);
            } else if (command.contains("Switch")) {
               String oldString = command.split(":")[1];
               String newString = command.split(":")[2];
               int startIndexOldString = sb.indexOf(oldString);
               int endIndexOldString = startIndexOldString + oldString.length();
               if (sb.toString().contains(oldString)) {
                  // while (sb.toString().contains(oldString)) {
                      sb.replace(startIndexOldString, endIndexOldString, newString);
                       System.out.println(sb);



               } else {
                   System.out.println(sb);
               }


            }



            command = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", sb);
    }
}
