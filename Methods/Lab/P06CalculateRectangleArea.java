package Methods.Lab;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        areaRectangle(width, length);

    }
    public static void areaRectangle(int width, int length) {
        System.out.println(width * length);
    }
}
