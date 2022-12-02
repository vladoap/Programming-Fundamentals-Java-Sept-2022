package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> composerMap = new LinkedHashMap<>();
        Map<String, String> keyMap = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String[] piecesData = scanner.nextLine().split("\\|");
            String piece = piecesData[0];
            String composer = piecesData[1];
            String key = piecesData[2];

            composerMap.put(piece, composer);
            keyMap.put(piece, key);
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] pieceData = command.split("\\|");
            if (command.contains("Add")) {
                String piece = pieceData[1];
                String composer = pieceData[2];
                String key = pieceData[3];
                if (!composerMap.containsKey(piece)) {
                    composerMap.put(piece, composer);
                    keyMap.put(piece, key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                } else {
                    System.out.printf("%s is already in the collection!%n", piece);
                }
            } else if (command.contains("Remove")) {
                String piece = pieceData[1];
                if (composerMap.containsKey(piece)) {
                    composerMap.remove(piece);
                    keyMap.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            } else if (command.contains("ChangeKey")) {
                String piece = pieceData[1];
                String newKey = pieceData[2];
                if (composerMap.containsKey(piece)) {
                    keyMap.put(piece, newKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }
          command = scanner.nextLine();
        }
        composerMap.entrySet().forEach(entry -> {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue(), keyMap.get(entry.getKey()));
        });
    }
}
