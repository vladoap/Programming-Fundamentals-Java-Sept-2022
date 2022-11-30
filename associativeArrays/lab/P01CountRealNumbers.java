package associativeArrays.lab;

import java.util.*;
import java.util.stream.Collectors;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> numList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> map = new TreeMap<>();
      //8 2 2 8 2
        for (double num : numList) {
            Integer currentValue = map.get(num);
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, currentValue + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }



    }
}
