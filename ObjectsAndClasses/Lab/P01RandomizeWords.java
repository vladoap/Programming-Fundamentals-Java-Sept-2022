package ObjectsAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputArr = scan.nextLine().split(" ");
        Random rnd = new Random();
        int length = inputArr.length;
      // Генерира се в цикъл случайно число с размер до inputArr.length
        for (int i = 0; i < length; i++) {
            int randomIndex = rnd.nextInt(length);
            // Взима се текущия елемент и елемент на случайно генериран индекс и се разменят местата им.
            String randomElement = inputArr[randomIndex];
            String currentElement = inputArr[i];

            inputArr[randomIndex] = currentElement;
            inputArr[i] = randomElement;
        }
        // принтира се масива
        for (String s : inputArr) {
            System.out.println(s);

        }

    }
}
