package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {

    static class Student {
       private String firstName;
       private String lastname;
       private int age;
       private String city;

        Student (String firstName, String lastname, int age, String city) {
            this.firstName = firstName;
            this.lastname = lastname;
            this.age = age;
            this.city = city;
        }

        boolean isFrom (String city) {
            return this.city.equals(city);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String line = scan.nextLine();

        while (!line.equals("end")) {
            String[] inputArr = line.split(" ");
            String firstName = inputArr[0];
            String lastName = inputArr[1];
            int age = Integer.parseInt(inputArr[2]);
            String city = inputArr[3];
            Student currentStudent = new Student(firstName, lastName, age, city);
            students.add(currentStudent);





            line = scan.nextLine();
        }
        String city = scan.nextLine();
        for (Student student : students) {
            if (student.isFrom(city)) {
                System.out.println(String.format("%s %s is %d years old",
                        student.firstName, student.lastname, student.age ));
            }
        }


    }
}
