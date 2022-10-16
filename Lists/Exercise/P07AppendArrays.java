package Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> arrayLists = Arrays
                .stream(scan.nextLine().split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(arrayLists);
        System.out.println(arrayLists.toString()
                .trim().replaceAll("[\\[\\],]", "").replaceAll("\\s+", " "));
        }


    }

