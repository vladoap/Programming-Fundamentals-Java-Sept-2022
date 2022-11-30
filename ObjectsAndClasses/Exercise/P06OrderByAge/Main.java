package ObjectsAndClasses.Exercise.P06OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        String line = scan.nextLine();

        while (!line.equals("End")) {
            String[] lineArr = line.split("\\s+");
            String name = lineArr[0];
            int id = Integer.parseInt(lineArr[1]);
            int age = Integer.parseInt(lineArr[2]);
            personList.add(new Person(name, id, age));

            line = scan.nextLine();
        }
        personList.sort(Comparator.comparingInt(Person :: getAge));

        for (Person person : personList) {
            System.out.println(person.toString());
        }

    }
}
