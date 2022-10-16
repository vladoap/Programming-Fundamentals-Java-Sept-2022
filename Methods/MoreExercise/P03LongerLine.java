package Methods.MoreExercise;

import java.util.Scanner;

public class P03LongerLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = Integer.parseInt(scan.nextLine());
        int y1 = Integer.parseInt(scan.nextLine());
        int x2 = Integer.parseInt(scan.nextLine());
        int y2 = Integer.parseInt(scan.nextLine());
        int x3 = Integer.parseInt(scan.nextLine());
        int y3 = Integer.parseInt(scan.nextLine());
        int x4 = Integer.parseInt(scan.nextLine());
        int y4 = Integer.parseInt(scan.nextLine());

        double pt1Line1 = distanceOfPoint(x1, y1);
        double pt2Line1 = distanceOfPoint(x2, y2);
        double lengthLine1 = distanceOfLine(x1, y1, x2, y2);
        double pt1Line2 = distanceOfPoint(x3, y3);
        double pt2Line2 = distanceOfPoint(x4, y4);
        double lengthLine2 = distanceOfLine(x3, y3, x4, y4);

        if (lengthLine1 >= lengthLine2) {
            if (pt1Line1 < pt2Line1) {
                System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2 );
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1 );
            }
            } else {
            if (pt1Line2 < pt2Line2) {
                System.out.printf("(%d, %d)(%d, %d)", x3, y3, x4, y4 );
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x4, y4, x3, y3 );
            }
        }
        }


public static double distanceOfLine(int x1, int y1, int x2, int y2) {
        double lengthLine = Math.sqrt(Math.pow(x1 -x2, 2) + Math.pow(y1 - y2, 2));
        return lengthLine;
}

    public static double distanceOfPoint(double x, double y) {
        double distancePoint = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distancePoint;
    }
}
