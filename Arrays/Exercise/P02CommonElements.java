package Arrays.Exercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] Array1 = scan.nextLine().split(" ");
        String[] Array2 = scan.nextLine().split(" ");

        for (String elementArr2 : Array2) {
            for (String elementArr1 : Array1) {
                if (elementArr2.equals(elementArr1)) {
                    System.out.print(elementArr2 + " ");
                    break;
                }
            }
        }
    }
}
