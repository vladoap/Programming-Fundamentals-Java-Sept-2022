package associativeArrays.moreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P01Ranking {
    static class Student {
        private String name;
        private Map<String, Integer> contestsMap;


        public Student(String contest, String name, int points) {
            this.contestsMap = new HashMap<>();
            this.contestsMap.put(contest, points);
            this.name = name;

        }

        public String getName() {
            return this.name;
        }

        public Map<String, Integer> getContest() {
            return this.contestsMap;
        }

        public void setContest(String contest, int points) {
            this.contestsMap.put(contest, points);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineInput = scan.nextLine();
        List<Student> studentsList = new ArrayList<>();
        Map<String, String> contestMap = new HashMap<>();
        while (!lineInput.equals("end of contests")) {
            String contest = lineInput.split(":")[0];
            String password = lineInput.split(":")[1];

            contestMap.putIfAbsent(contest, password);
            lineInput = scan.nextLine();
        }

        lineInput = scan.nextLine();

        while (!lineInput.equals("end of submissions")) {
            String contest = lineInput.split("=>")[0];
            String password = lineInput.split("=>")[1];
            String studentName = lineInput.split("=>")[2];
            int points = Integer.parseInt(lineInput.split("=>")[3]);

            boolean isValidContest = contestMap.containsKey(contest);
            boolean isPasswordCorrect = false;
            if (isValidContest) {
                isPasswordCorrect = contestMap.get(contest).equals(password);
            }
            boolean isExistStudent = false;
            Student currentStudent = null;

            for (Student student : studentsList) {
                if (student.getName().contains(studentName)) {
                    isExistStudent = true;
                }
            }
            if (isValidContest && isPasswordCorrect) {
                if (!isExistStudent) {
                    currentStudent = new Student(contest, studentName, points);
                    studentsList.add(currentStudent);
                    lineInput = scan.nextLine();
                    continue;
                } else {
                    for (Student student : studentsList) {
                        if (student.getName().equals(studentName)) {
                            currentStudent = student;
                        }
                    }

                    if (currentStudent.getContest().containsKey(contest)) {
                        if (currentStudent.getContest().get(contest) < points) {
                            currentStudent.setContest(contest, points);
                        }
                    } else {
                        currentStudent.setContest(contest, points);
                    }
                }


            }

            lineInput = scan.nextLine();

        }

        studentsList.sort(Comparator.comparing(Student::getName));

        int bestPoints = Integer.MIN_VALUE;
        String bestStudent = "";

        for (Student student : studentsList) {
            int sumPoints = student.getContest().values().stream().mapToInt(Integer::intValue).sum();
            if (sumPoints > bestPoints) {
                bestPoints = sumPoints;
                bestStudent = student.getName();
            }
        }

        System.out.printf("Best candidate is %s with total %d points.%n",bestStudent, bestPoints );

        System.out.println("Ranking:");
        studentsList.forEach(entry -> {
            System.out.println(entry.getName());
            entry.getContest().entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .forEach(e -> System.out.println("#  " + e.getKey() + " -> " + e.getValue()));
        });



    }
}





