package OldExams;

import java.util.*;
import java.util.stream.Collectors;

public class P09Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int countTopNumbers = 0;
        boolean isFound = false;
        int sumElements = 0;
        for (int element : numbers) {
            sumElements += element;
        }
        double averageValue = sumElements * 1.00 / numbers.size();


        for (int element : numbers) {
            if (element > averageValue) {
                resultList.add(element);
                isFound = true;
            }
        }
        Collections.sort(resultList);
        Collections.reverse(resultList);

        if (isFound) {
            for (int item : resultList) {
                if (countTopNumbers == 5) {
                     break;
                }
                System.out.print(item + " ");
                countTopNumbers++;
            }
        } else {
            System.out.println("No");
        }


    }
}
