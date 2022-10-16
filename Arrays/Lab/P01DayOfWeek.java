package Arrays.Lab;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] dayOfWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        } ;

        int num = Integer.parseInt(scan.nextLine());

        if (num >= 1 && num <= 7) {
            System.out.println(dayOfWeek[num - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
