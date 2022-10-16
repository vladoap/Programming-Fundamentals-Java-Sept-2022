package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countCommands = Integer.parseInt(scan.nextLine());
        List<String> guestListGoing = new ArrayList<>();


        for (int i = 1; i <= countCommands ; i++) {
            String inputLine = scan.nextLine();
            String nameCurrentGuest = inputLine.split("\\s+")[0];
            if (inputLine.contains("is going!")) {
                if (guestListGoing.contains(nameCurrentGuest)) {
                    System.out.printf("%s is already in the list!%n", nameCurrentGuest);
                } else {
                    guestListGoing.add(nameCurrentGuest);
                }
            } else if (inputLine.contains("is not going!")) {
                if (!guestListGoing.contains(nameCurrentGuest)) {
                    System.out.printf("%s is not in the list!%n", nameCurrentGuest);
                } else {
                    guestListGoing.remove(nameCurrentGuest);
                }
            }


        }

        for (String item : guestListGoing) {
            System.out.println(item);
        }
    }
}
