package Lists.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<String> productList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String currentProduct = scan.nextLine();
            productList.add(currentProduct);
        }
        // Сортиране по азбучен ред на листа
        Collections.sort(productList);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d.%s%n", i + 1, productList.get(i));
        }
    }
}
