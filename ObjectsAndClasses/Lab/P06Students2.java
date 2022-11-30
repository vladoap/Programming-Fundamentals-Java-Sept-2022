package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2 {

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

         String getFirstName() {
            return this.firstName;
        }

        String getLastName() {
            return this.lastname;
        }

         void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        void setLastName(String lastName) {
            this.lastname = lastName;
        }

        void setAge(int age) {
            this.age = age;
        }

        void setCity(String city) {
            this.city = city;
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


           Student existingStudent = findStudent(students, firstName, lastName);
           if (existingStudent == null) {
               students.add(new Student(firstName, lastName, age, city));
           } else {
               existingStudent.setFirstName(firstName);
               existingStudent.setLastName(lastName);
               existingStudent.setAge(age);
               existingStudent.setCity(city);
           }








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

    private static Student findStudent(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName)
            && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }
}
