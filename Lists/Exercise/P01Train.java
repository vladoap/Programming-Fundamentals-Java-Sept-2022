package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersPassengersList = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacityPerWagon = Integer.parseInt(scan.nextLine());
        String inputLine = scan.nextLine();

        while (!inputLine.equals("end")) {
            if (inputLine.contains("Add")) {
                int numberPassengers = Integer.parseInt(inputLine.split(" ")[1]);
                numbersPassengersList.add(Integer.valueOf(numberPassengers));
            }
            else {
                int numberPassengers = Integer.parseInt(inputLine);
                for (int i = 0; i <= numbersPassengersList.size() - 1 ; i++) {
                    if (numbersPassengersList.get(i) + numberPassengers <= maxCapacityPerWagon) {
                         numbersPassengersList.set(i, numbersPassengersList.get(i) + numberPassengers );
                        break;
                } {

                    }
                }
            }


            inputLine = scan.nextLine();
        }
        System.out.println(numbersPassengersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
