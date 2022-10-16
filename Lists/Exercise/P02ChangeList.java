package Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputLine = scan.nextLine();

        while (!inputLine.equals("end")) {
            if (inputLine.contains("Delete")) {
                int removeNumber = Integer.parseInt(inputLine.split(" ")[1]);
                numbersList.removeAll(Arrays.asList(removeNumber));
            } else if (inputLine.contains("Insert")) {
                int insertNum = Integer.parseInt(inputLine.split(" ")[1]);
                int insertIndex = Integer.parseInt(inputLine.split(" ")[2]);
                numbersList.add(insertIndex, insertNum);



            }
            inputLine = scan.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
