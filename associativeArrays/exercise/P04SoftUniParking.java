package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countCommands = Integer.parseInt(scan.nextLine());

        String lineInput = scan.nextLine();
        Map<String, String> parkingMap = new LinkedHashMap<>();

        for (int i = 1; i <= countCommands ; i++) {
           if (lineInput.contains("unregister")) {
                String userName = lineInput.split(" ")[1];
                if (!parkingMap.containsKey(userName)) {
                    System.out.printf("ERROR: user %s not found%n", userName);
                } else {
                    parkingMap.remove(userName);
                    System.out.printf("%s unregistered successfully%n", userName);
                }

            } else if (lineInput.contains("register")) {
               String userName = lineInput.split(" ")[1];
               String plateNumber = lineInput.split(" ")[2];
               if (!parkingMap.containsKey(userName)) {
                   parkingMap.put(userName, plateNumber);
                   System.out.printf("%s registered %s successfully%n", userName, plateNumber);
               } else {
                   System.out.printf("ERROR: already registered with plate number %s%n", parkingMap.get(userName));
               }

           }
              if (i != countCommands) {
                lineInput = scan.nextLine();
            }


        }

       parkingMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));

    }
}
