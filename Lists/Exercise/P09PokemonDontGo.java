package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> distanceList = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

         int sumRemovedElements = 0;

        while (distanceList.size() != 0) {
            int index = Integer.parseInt(scan.nextLine());

            if (index < 0) {
                int firstElement = distanceList.get(0);
                int lastElement = distanceList.get(distanceList.size() - 1);
                sumRemovedElements += firstElement;
                distanceList.remove(0);
                distanceList.add(0, lastElement);
                for (int i = 0; i < distanceList.size(); i++) {
                    int currElement = distanceList.get(i);
                    if (currElement <= firstElement) {
                        currElement += firstElement;
                    } else {
                        currElement -= firstElement;
                    }
                    distanceList.set(i, currElement);
                }

            } else if (index > distanceList.size() -1) {
                int firstElement = distanceList.get(0);
                int lastElement = distanceList.get(distanceList.size() - 1);
                sumRemovedElements += lastElement;
                distanceList.remove(distanceList.size() -1);
                distanceList.add(firstElement);
                for (int i = 0; i < distanceList.size(); i++) {
                    int currElement = distanceList.get(i);
                    if (currElement <= lastElement) {
                        currElement += lastElement;
                    } else {
                        currElement -= lastElement;
                    }
                    distanceList.set(i, currElement);
                }

            } else {
                int removedElement = distanceList.get(index);
                sumRemovedElements += removedElement;
                distanceList.remove(index);
                for (int i = 0; i < distanceList.size(); i++) {
                    int currElement = distanceList.get(i);
                    if (currElement <= removedElement) {
                        currElement += removedElement;
                    } else {
                       currElement -= removedElement;
                    }
                    distanceList.set(i, currElement);
                }
            }
        }
        System.out.println(sumRemovedElements);

    }
}
