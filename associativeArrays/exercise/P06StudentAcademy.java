package associativeArrays.exercise;

import java.util.*;
import java.util.function.DoubleUnaryOperator;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            if (!studentsMap.containsKey(name)) {
                studentsMap.put(name, new ArrayList<>());
                studentsMap.get(name).add(grade);
            } else {
                studentsMap.get(name).add(grade);
            }

        }
        studentsMap.entrySet().stream().filter(entry ->
                        (entry.getValue().stream().mapToDouble(Double::doubleValue).sum() /
                                entry.getValue().size()) >= 4.50)
                .forEach(entry -> System.out.printf("%s -> %.2f%n",
                        entry.getKey(), entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble()));


    }
}

