package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scan.nextLine());
        int capacityElevator = Integer.parseInt(scan.nextLine());

        int courses = (int)Math.ceil((double) numberPeople/ capacityElevator);
        System.out.println(courses);
    }
}
