package Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> scheduleList = Arrays
                .stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("course start")) {
            if (command.contains("Add")) {
                String currentLesson = command.split(":")[1];
                scheduleList = addLesson(scheduleList, currentLesson);
            } else if (command.contains("Insert")) {
                String currentLesson = command.split(":")[1];
                int index = Integer.parseInt(command.split(":")[2]);
                scheduleList = insertLesson(scheduleList, currentLesson, index);
            } else if (command.contains("Remove")) {
                String currentLesson = command.split(":")[1];
                scheduleList = removeLesson(scheduleList, currentLesson);
            } else if (command.contains("Swap")) {
                String lessonOne = command.split(":")[1];
                String lessonTwo = command.split(":")[2];
                scheduleList = swapLesson(scheduleList, lessonOne, lessonTwo);
            } else if (command.contains("Exercise")) {
                String currentLesson = command.split(":")[1];
                scheduleList = addExercise(scheduleList, currentLesson);
            }


            command = scan.nextLine();
        }
        for (int i = 0; i < scheduleList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, scheduleList.get(i));
        }
    }
    public static List<String> addLesson (List<String> scheduleList, String currentLesson) {
        if (!scheduleList.contains(currentLesson)) {
            scheduleList.add(currentLesson);
        }
        return scheduleList;
    }

    public static List<String> insertLesson (List<String> scheduleList, String currentLesson, int index) {
        if (!scheduleList.contains(currentLesson)) {
            scheduleList.add(index, currentLesson);
        }
        return scheduleList;
    }

    public static List<String> removeLesson (List<String> scheduleList, String currentLesson) {
        if (scheduleList.contains(currentLesson)) {
            scheduleList.remove(currentLesson);
        }
        return scheduleList;
    }

    public static List<String> swapLesson (List<String> scheduleList, String lessonOne, String lessonTwo) {

        if (scheduleList.contains(lessonOne) && scheduleList.contains(lessonTwo)) {
            int indexLessonOne = scheduleList.indexOf(lessonOne);
            int indexLessonTwo = scheduleList.indexOf(lessonTwo);
            scheduleList.set(indexLessonOne, lessonTwo);
            scheduleList.set(indexLessonTwo, lessonOne);
            String exOne = lessonOne + "-Exercise";
            String exTwo = lessonTwo + "-Exercise";

            if (scheduleList.contains(exOne)) {
                scheduleList.remove(scheduleList.indexOf(exOne));
                scheduleList.add(scheduleList.indexOf(lessonOne) + 1, exOne);
            }

            if (scheduleList.contains(exTwo)) {
                scheduleList.remove(scheduleList.indexOf(exTwo));
                scheduleList.add(scheduleList.indexOf(lessonTwo) + 1, exTwo );
            }
          //  Collections.swap(scheduleList, indexLessonOne, indexLessonTwo);

//            if (scheduleList.contains(lessonOne + "-Exercise")) {
//                String exOne = lessonOne + "-Exercise";
//                scheduleList.remove(exOne);
//                scheduleList.add(indexLessonTwo + 1, exOne);
//            }
//            if (scheduleList.contains(lessonTwo + "-Exercise")) {
//                String exTwo = lessonTwo + "-Exercise";
//                scheduleList.remove(exTwo);
//                scheduleList.add(indexLessonOne + 1, exTwo);
//            }

        }

        return scheduleList;
    }

    public static List<String> addExercise (List<String> scheduleList, String currentLesson) {
        if (scheduleList.contains(currentLesson)) {
            int lessonIndex = scheduleList.indexOf(currentLesson);

            if (lessonIndex == scheduleList.size() - 1) {
                // ако е последен елемент се добавя само Exercise, защото не може да се провери lessonIndex + 1 , тъй като НЕ съществува и
                // дава Run Time error
                scheduleList.add(lessonIndex + 1, currentLesson + "-Exercise");
            } else if (!scheduleList.get(lessonIndex + 1).equals(currentLesson + "-Exercise")) // ако не съдържа Exercise го добави само него

                scheduleList.add(lessonIndex + 1, currentLesson + "-Exercise");

        } else {
            scheduleList.add(currentLesson);
            scheduleList.add(currentLesson + "-Exercise");
        }

        return scheduleList;
    }

}
