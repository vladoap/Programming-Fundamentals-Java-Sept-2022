package textProcessing.moreExercise;

import java.util.Scanner;

public class P01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n ; i++) {
            String lineInput = scan.nextLine();
            int startIndexName = lineInput.indexOf('@') + 1;
            int endIndexName = lineInput.indexOf('|');
            String name = lineInput.substring(startIndexName, endIndexName);

            int startIndexAge = lineInput.indexOf('#') + 1;
            int endIndexAge = lineInput.indexOf('*');
            int age = Integer.parseInt(lineInput.substring(startIndexAge,endIndexAge));

            System.out.printf("%s is %d years old.%n", name, age);

        }

    }
}
