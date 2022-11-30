package ObjectsAndClasses.Exercise.P04Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n ; i++) {
            String[] inputArr = scan.nextLine().split(" ");
            String firstName = inputArr[0];
            String lastName = inputArr[1];
            double grade = Double.parseDouble(inputArr[2]);
            Student currentStudent = new Student(firstName, lastName, grade);
            students.add(currentStudent);
        }
// сортира в низходящ ред обектите от клас Student в листа ( сортира по Оценка прочетена от метода getGrade)
        students.sort(Comparator.comparingDouble(Student :: getGrade).reversed());
        for (Student student : students) {
            System.out.println(student.toString());
        }


    }
}
