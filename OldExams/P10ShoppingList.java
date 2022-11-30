package OldExams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> productList = Arrays
                .stream(scan.nextLine().split("!"))
                .collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] commandArr = command.split(" ");
            String item = commandArr[1];
            switch (commandArr[0]) {
                case "Urgent":
                    if (!productList.contains(item)) {
                        productList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (productList.contains(item)) {
                        productList.remove(item);
                    }
                    break;
                case "Correct":
                        if (productList.contains(item)) {
                            int indexOldItem = productList.indexOf(item);
                            productList.set(indexOldItem, commandArr[2]);
                        }
                        break;
                case "Rearrange":
                    if (productList.contains(item)) {
                        productList.remove(item);
                        productList.add(item);
                    }
                    break;
            }

            command = scan.nextLine();
        }
        System.out.println(String.join(", ", productList));
    }
}
