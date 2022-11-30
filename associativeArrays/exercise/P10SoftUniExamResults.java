package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineInput = scan.nextLine();
        Map<String, Integer> studentsMap = new LinkedHashMap<>();
        Map<String, Integer> submissionsMap = new LinkedHashMap<>();
        while (!lineInput.equals("exam finished")) {
              if (lineInput.contains("banned")) {
                  String username = lineInput.split("-")[0];
                   studentsMap.remove(username);
              } else {
                  String username = lineInput.split("-")[0];
                  String language = lineInput.split("-")[1];
                  int points = Integer.parseInt(lineInput.split("-")[2]);

                  if (!studentsMap.containsKey(username)) {
                      studentsMap.put(username, points);
                  } else {
                      int currentPoints = studentsMap.get(username);
                      if (currentPoints < points) {
                          studentsMap.put(username, points);
                      }
                  }

                  if (!submissionsMap.containsKey(language)) {
                      submissionsMap.put(language, 1);
                  } else {
                      int countSubmission = submissionsMap.get(language);
                      submissionsMap.put(language, countSubmission + 1);
                  }
              }



            lineInput = scan.nextLine();
        }

        System.out.println("Results:");
        studentsMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        });
        System.out.println("Submissions:");
        submissionsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
