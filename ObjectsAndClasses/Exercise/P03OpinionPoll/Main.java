package ObjectsAndClasses.Exercise.P03OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n ; i++) {
            String[] inputArr = scan.nextLine().split(" ");
            String name = inputArr[0];
            int age = Integer.parseInt(inputArr[1]);
            Person currentPerson = new Person(name, age);
            people.add(currentPerson);
        }

        for (Person person : people) {
            if (person.getAge() > 30) {
                System.out.println(person.toString());
            }
        }

    }
}
