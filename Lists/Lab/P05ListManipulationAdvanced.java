package Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputLine = scan.nextLine();
        while (!inputLine.equals("end")) {
            String[] inputLineArr = inputLine.split(" ");
            if (inputLine.contains("Contains")) {
                int number = Integer.parseInt(inputLineArr[1]);
                isContain(numbersList, number);
            } else if (inputLine.contains("Print even")) {
                printEven(numbersList);
            } else if (inputLine.contains("Print odd")) {
                printOdd(numbersList);
            } else if (inputLine.contains("Get sum")) {
                printSum(numbersList);
            } else if (inputLine.contains("Filter")) {
                int number = Integer.parseInt(inputLineArr[2]);
               filterList(numbersList, inputLineArr[1], number);
            }
            System.out.println();
            inputLine = scan.nextLine();
            }
        }

        public static void isContain (List<Integer> numberList, int num) {
        boolean isFound = false;
        for (int item : numberList) {
            if (item == num) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.print("Yes");
        } else {
            System.out.print("No such number");
        }
        }

        public static void printEven (List<Integer> numberList) {
        for (int item : numberList) {
            if (item % 2 == 0) {
                System.out.print(item + " ");
            }
        }
        }

        public static void printOdd (List<Integer> numberList) {
        for (int item : numberList) {
            if (item % 2 != 0) {
                System.out.print(item + " ");
            }
        }
    }

        public static void printSum (List<Integer> numberList) {
        int sum = 0;
        for (int item : numberList) {
            sum += item;
        }
            System.out.print(sum);

       }

       public static void filterList (List<Integer> numberList, String condition, int num) {
        switch (condition) {
            case "<":
                for (int item : numberList) {
                    if (item < num) {
                        System.out.print(item + " ");
                    }
                }
                break;
            case ">":
                for (int item : numberList) {
                    if (item > num) {
                        System.out.print(item + " ");
                    }
                }
                break;
            case ">=":
                for (int item : numberList) {
                    if (item >= num) {
                        System.out.print(item + " ");
                    }
                }
                break;
            case "<=":
                for (int item : numberList) {
                    if (item <= num) {
                        System.out.print(item + " ");
                    }
                }
                break;
        }
       }


    }

