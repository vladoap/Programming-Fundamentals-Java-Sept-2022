package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> chatList = new ArrayList<>();

        String command = scan.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split("\\s+");
            if (command.contains("Chat")) {
                 chatList.add(commandArr[1]);
            } else if (command.contains("Delete")) {
                chatList.remove(commandArr[1]);
            } else if (command.contains("Edit")) {
                if (chatList.contains(commandArr[1])) {
                    int index = chatList.indexOf(commandArr[1]);
                    chatList.set(index, commandArr[2]);
                }
            } else if (command.contains("Pin")) {
                if (chatList.contains(commandArr[1])) {
                    chatList.remove(commandArr[1]);
                    chatList.add(commandArr[1]);
                }
            } else if (command.contains("Spam")) {
                for (int i = 1; i < commandArr.length ; i++) {
                    chatList.add(commandArr[i]);
                }
            }

            command = scan.nextLine();
        }
       for (String item : chatList) {
           System.out.println(item);
       }
    }
}
