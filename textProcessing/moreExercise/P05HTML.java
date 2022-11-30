package textProcessing.moreExercise;

import java.util.Scanner;

public class P05HTML {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String title = scan.nextLine();
        String content = scan.nextLine();
        String comment = scan.nextLine();

        System.out.println("<h1>");
        System.out.println("    " + title);
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.println("    " + content);
        System.out.println("</article>");

        while (!comment.equals("end of comments")) {
            System.out.println("<div>");
            System.out.println("    " + comment);
            System.out.println("</div>");
            comment = scan.nextLine();
        }
    }
}
