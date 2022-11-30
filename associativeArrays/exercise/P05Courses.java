package associativeArrays.exercise;

import java.util.*;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> coursesMap = new LinkedHashMap<>();
        String lineInput = scan.nextLine();

        while (!lineInput.equals("end")) {
            String courseName = lineInput.split("\\:")[0].trim();
            String studentName = lineInput.split("\\:")[1].trim();
            if (!coursesMap.containsKey(courseName)) {
                coursesMap.put(courseName, new ArrayList<>());
                coursesMap.get(courseName).add(studentName);
            } else {
                coursesMap.get(courseName).add(studentName);
            }

            lineInput = scan.nextLine();
        }

        coursesMap.entrySet().forEach(entry -> {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            for (String student : entry.getValue()) {
                System.out.printf("-- %s%n", student);
            }
        });
    }
}
