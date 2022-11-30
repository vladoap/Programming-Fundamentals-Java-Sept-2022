// замества се във входа символа : --> - , за да може да се запазят данните в Лист разделени по -
// List добавяне, изтриване, вмъкване и преместване на String elements
// split/replaceAll по различни символи

package OldExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> dataList = Arrays
                .stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("Craft!")) {
            if (input.contains("Collect")) {
                collectItems(dataList, input);
            } else if (input.contains("Drop")) {
                removeItems(dataList, input);
            } else if (input.contains("Combine Items")) {
                combineItems(dataList, input);
            } else if (input.contains("Renew")) {
                renewItems(dataList, input);
            }

            input = scan.nextLine();
        }

        System.out.println(String.join(", ", dataList));

    }

    public static List<String> collectItems (List<String> dataList, String input) {
        String currentItem = input.split(" - ")[1];
        boolean isContain = false;
        for (String item : dataList) {
            if (item.equals(currentItem)) {
                isContain = true;
                break;
            }
        }
        if (!isContain) {
            dataList.add(currentItem);
        }
        return dataList;
    }

    public static List<String> removeItems (List<String> dataList, String input) {
        String currentItem = input.split(" - ")[1];
        boolean isContain = false;
        for (String item : dataList) {
            if (item.equals(currentItem)) {
                isContain = true;
                break;
            }
        }
        if (isContain) {
            dataList.remove(currentItem);
        }
        return dataList;
    }

    public static List<String> combineItems (List<String> dataList, String input) {
       input = input.replaceAll(":", " - ");
       // замества се във входа символа : --> - , за да може да се запазят данните в Лист разделени по -

        List<String> inputArr = Arrays
                .stream(input.split(" - "))
                .collect(Collectors.toList());
        String oldItem = inputArr.get(1);
        String newItem = inputArr.get(2);
        int indexOldItem = dataList.indexOf(oldItem);
        boolean isContain = false;
        for (String item : dataList) {
            if (item.equals(oldItem)) {
                isContain = true;
                break;
            }
        }
        if (isContain) {
            dataList.add(indexOldItem + 1, newItem);
        }
        return dataList;
    }

    public static List<String> renewItems (List<String> dataList, String input) {
        String currentItem = input.split(" - ")[1];
        boolean isContain = false;
        for (String item : dataList) {
            if (item.equals(currentItem)) {
                isContain = true;
                break;
            }
        }
        if (isContain) {
            dataList.remove(currentItem);
            dataList.add(currentItem);

        }
        return dataList;
    }


}
