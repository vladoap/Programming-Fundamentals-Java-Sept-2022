package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> inputList = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("3:1")) {
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                inputList = mergeList(inputList, startIndex, endIndex);
            } else if (command.contains("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int partitions = Integer.parseInt(command.split(" ")[2]);
                inputList = divideList(inputList, index, partitions);
            }
            command = scan.nextLine();
        }
        System.out.println(String.join(" ", inputList));

    }

    public static List<String> mergeList(List<String> list, int startIndex, int endIndex) {
        if (startIndex < 0) {
            startIndex = 0;
        } else if (startIndex >= list.size() - 1) {
            startIndex = list.size() - 1;
        }
        if (endIndex < 0) {
            startIndex = 0;
        } else if (endIndex >= list.size() - 1) {
            endIndex = list.size() - 1;
        }
        String resultMerge = "";
        for (int i = startIndex; i <= endIndex; i++) {
            resultMerge += list.get(i);
        }
        for (int i = startIndex; i <= endIndex; i++) {
            list.remove(startIndex);
        }
        list.add(startIndex, resultMerge);

        return list;

    }

    public static List<String> divideList(List<String> list, int index, int partitions) {
        String elementForDivide = list.get(index); // adcdef
        int countElementsPerPartition = elementForDivide.length() / partitions; // 2 елемента
        list.remove(index);
        int beginIndex = 0;
        for (int i = 1; i < partitions; i++) {
            list.add(index, elementForDivide.substring(beginIndex, countElementsPerPartition + beginIndex));
            index++;
            beginIndex += countElementsPerPartition;
        }
        list.add(index, elementForDivide.substring(beginIndex));

        return list;
    }

}
