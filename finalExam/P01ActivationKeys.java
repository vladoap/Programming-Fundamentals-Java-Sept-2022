package finalExam;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String key = scan.nextLine();

        String input = scan.nextLine();

        while (!input.equals("Generate")) {
            if (input.contains("Contains>>>")) {
                String subString = input.split(">>>")[1];
                if (key.contains(subString)) {
                    System.out.printf("%s contains %s%n", key, subString);
                } else {
                    System.out.println("Substring not found!");
                }
            } else if (input.contains("Flip>>>Upper")) {
                int startIndex = Integer.parseInt(input.split(">>>")[2]);
                int endIndex = Integer.parseInt(input.split(">>>")[3]);
                String subStringOld = key.substring(startIndex, endIndex);
                String subStringNew = key.substring(startIndex, endIndex).toUpperCase();
                key = key.replace(subStringOld, subStringNew);
                System.out.println(key);
            } else if (input.contains("Flip>>>Lower")) {
                int startIndex = Integer.parseInt(input.split(">>>")[2]);
                int endIndex = Integer.parseInt(input.split(">>>")[3]);
                String subStringOld = key.substring(startIndex, endIndex);
                String subStringNew = key.substring(startIndex, endIndex).toUpperCase();
                key = key.replace(subStringOld, subStringNew);
                System.out.println(key);
            } else if (input.contains("Slice>>>")) {
                int startIndex = Integer.parseInt(input.split(">>>")[1]);
                int endIndex = Integer.parseInt(input.split(">>>")[2]);
                String subString = key.substring(startIndex, endIndex);
                key = key.replace(subString, "");
                System.out.println(key);
            }

            input = scan.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", key);
    }
}
