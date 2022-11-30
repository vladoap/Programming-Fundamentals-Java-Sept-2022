package ObjectsAndClasses.Exercise.P02Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputArr = scan.nextLine().split(", ");
        String title = inputArr[0];
        String content = inputArr[1];
        String author = inputArr[2];
        Article article = new Article(title, content, author);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] currentInputArr = scan.nextLine().split("\\: ");
            String command = currentInputArr[0];
            String newInput = currentInputArr[1];

            switch (command) {
                case "Edit":
                    article.edit(newInput);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newInput);
                    break;
                case "Rename":
                    article.rename(newInput);
                    break;
            }
        }
        System.out.println(article.toString());


    }
}
