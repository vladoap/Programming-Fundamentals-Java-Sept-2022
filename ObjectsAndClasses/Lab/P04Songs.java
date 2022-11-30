package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {

    static class Song {
        private String typeList;
        private String name;
        private String time;

        Song (String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        String getName() {
            return this.name;
        }

        boolean isTypeList(String typeList) {
            return this.typeList.equals(typeList);
        }
    }
    public static void main(String[] args) {
        // създаване на лист от обекти Song клас
        List<Song> songs = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n ; i++) {
            String[] inputArr = scan.nextLine().split("_");
            String typeList = inputArr[0];
            String name = inputArr[1];
            String time = inputArr[2];
            // добавяме в лист songs нов обект от клас Song
            songs.add(new Song(typeList, name, time));

        }
        String typeList = scan.nextLine();
        for (Song song : songs) {
            if (song.isTypeList(typeList)) {
                System.out.println(song.getName());

            }
            }
        if (typeList.equals("all")) {
            for (Song song1 : songs) {
                System.out.println(song1.getName());

            }
        }

    }
}
