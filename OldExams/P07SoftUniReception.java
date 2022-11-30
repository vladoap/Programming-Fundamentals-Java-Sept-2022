package OldExams;

import java.util.Scanner;

public class P07SoftUniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int employeeOneStudents = Integer.parseInt(scan.nextLine());
        int employeeTwoStudents = Integer.parseInt(scan.nextLine());
        int employeeThreeStudents = Integer.parseInt(scan.nextLine());
        int countStudents = Integer.parseInt(scan.nextLine());

        int studentsPerHour = employeeOneStudents + employeeTwoStudents + employeeThreeStudents;
        int countHours = 0;

        while (countStudents > 0) {
            countHours++;
            if (countHours % 4 == 0 && countHours != 0) {
                continue;
            }
            countStudents -= studentsPerHour;


        }

        System.out.printf("Time needed: %dh.", countHours);
    }
}
