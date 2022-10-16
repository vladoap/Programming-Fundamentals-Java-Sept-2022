package Methods.MoreExercise;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P02CenterPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = Integer.parseInt(scan.nextLine());
        int y1 = Integer.parseInt(scan.nextLine());
        int x2 = Integer.parseInt(scan.nextLine());
        int y2 = Integer.parseInt(scan.nextLine());

     closestPoint(x1, y1, x2, y2);
    }
    public static void closestPoint(int x1, int y1, int x2, int y2) {
        double firstPoint = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double secondPoint = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        if (firstPoint <= secondPoint) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }

}

