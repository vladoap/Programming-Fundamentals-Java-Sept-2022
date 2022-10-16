package Lists.Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> numbersList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        // 1. обхождане на всички елементи
        // 2. проверка дали числото на тази позиция е еднакво със следващото
        // 3. Ако е еднакво сумираме двете числа и го добавяме към числото на съответната позиция
        // 4. Изтриваме елемента на следващата позиция
        // 5. Връщаме индекса i, така че да започва отново да проверява от 1-вия елемент
        for (int i = 0; i < numbersList.size() - 1; i++) {
            double currentNum = numbersList.get(i);
            double nextNum = numbersList.get(i + 1);
            if (currentNum == nextNum) {
                numbersList.set(i, currentNum + nextNum);
                numbersList.remove(i + 1);
                i = -1;
            }
        }
        DecimalFormat df = new DecimalFormat("0.####");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(df.format(numbersList.get(i)) + " ");
        }



    }
}
