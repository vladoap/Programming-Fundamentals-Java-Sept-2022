package Lists.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05DrumSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double savings = Double.parseDouble(scan.nextLine());

        List<Integer> drumSet = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> initialDrumSet = new ArrayList<>();
        for (int i = 0; i < drumSet.size(); i++) {
            initialDrumSet.add(drumSet.get(i));
        }


        String input = scan.nextLine();

        while (!input.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(input);
            for (int i = 0; i < drumSet.size(); i++) {
                int currNumber = drumSet.get(i);
                drumSet.set(i, currNumber - hitPower);
            }
            for (int i = 0; i < drumSet.size(); i++) {
                if (drumSet.get(i) <= 0) {
                    int priceDrum = initialDrumSet.get(i) * 3;
                    if (priceDrum <= savings) {
                        drumSet.set(i, initialDrumSet.get(i));
                        savings -= priceDrum;
                    } else {
                        drumSet.remove(i);
                        initialDrumSet.remove(i);
                    }

                }
            }
       input = scan.nextLine();
        }
        System.out.println(drumSet.toString().replaceAll("[\\[\\],]", ""));
        System.out.printf("Gabsy has %.2flv.",savings );

    }
}
