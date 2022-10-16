package Methods.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06ArrayManipulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();
        String command = scan.nextLine();
        while (!command.equals("end")) {
            if (command.contains("exchange")) {
                int indexExchange = Integer.parseInt(command.split(" ")[1]);
                if (indexExchange >= 0 && indexExchange < numbers.length) {
                    numbers = exchangeArr(numbers, indexExchange);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("max") && command.contains("even")) {
                int indexMaxEven = maxEvenIndex(numbers);
                if (indexMaxEven >= 0) {
                    System.out.println(indexMaxEven);
                } else {
                    System.out.println("No matches");
                }
            } else if (command.contains("max") && command.contains("odd")) {
                int indexMaxOdd = maxOddIndex(numbers);
                if (indexMaxOdd >= 0) {
                    System.out.println(indexMaxOdd);
                } else {
                    System.out.println("No matches");
                }
            } else if (command.contains("min") && command.contains("even")) {
                int indexMinEven = minEvenIndex(numbers);
                if (indexMinEven < numbers.length) {
                    System.out.println(indexMinEven);
                } else {
                    System.out.println("No matches");
                }
            } else if (command.contains("min") && command.contains("odd")) {
                int indexMinOdd = minOddIndex(numbers);
                if (indexMinOdd < numbers.length) {
                    System.out.println(indexMinOdd);
                } else {
                    System.out.println("No matches");
                }
            } else if (command.contains("first") && command.contains("even")) {
                int countEven = Integer.parseInt(command.split(" ")[1]);
               printFirstEvens(numbers, countEven);
            } else if (command.contains("first") && command.contains("odd")) {
                int countOdd = Integer.parseInt(command.split(" ")[1]);
                printFirstOdds(numbers, countOdd);
            } else if (command.contains("last") && command.contains("even")) {
                int countEven = Integer.parseInt(command.split(" ")[1]);
                printLastEvens(numbers, countEven);
            } else if (command.contains("last") && command.contains("odd")) {
                int countOdd = Integer.parseInt(command.split(" ")[1]);
                printLastOdds(numbers, countOdd);
            }

            command = scan.nextLine();
        }
        System.out.println(Arrays.toString(numbers));
    }
    public static int[] exchangeArr (int[] numbers, int index) {
        int[] resultArr = new int[numbers.length];
        int currentIndex = 0;
        for (int i = index + 1; i < numbers.length ; i++) {
           resultArr[currentIndex] = numbers[i];
           currentIndex++;
        }
        for (int i = 0; i <= index ; i++) {
            resultArr[currentIndex] = numbers[i];
            currentIndex++;
        }
         return resultArr;
    }
    public static int maxEvenIndex (int[] numbers) {
        int maxEven = Integer.MIN_VALUE;
        int indexMaxEven = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length ; i++) {
             if (numbers[i] % 2 == 0) {
                 if (numbers[i] >= maxEven) {
                     maxEven = numbers[i];
                     indexMaxEven = i;
                 }
             }
        }
        return indexMaxEven;
    }

    public static int maxOddIndex (int[] numbers) {
        int maxOdd = Integer.MIN_VALUE;
        int indexMaxOdd = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] % 2 != 0) {
                if (numbers[i] >= maxOdd) {
                    maxOdd = numbers[i];
                    indexMaxOdd = i;
                }
            }
        }
        return indexMaxOdd;
    }

    public static int minOddIndex (int[] numbers) {
        int minOdd = Integer.MAX_VALUE;
        int indexMinOdd = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] % 2 != 0) {
                if (numbers[i] <= minOdd) {
                    minOdd = numbers[i];
                    indexMinOdd = i;
                }
            }
        }
        return indexMinOdd;
    }

    public static int minEvenIndex (int[] numbers) {
        int minEven = Integer.MAX_VALUE;
        int indexMinEven = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] % 2 == 0) {
                if (numbers[i] <= minEven) {
                    minEven = numbers[i];
                    indexMinEven = i;
                }
            }
        }
        return indexMinEven;
    }

    public static void printFirstEvens(int[] numbers, int count) {
        boolean isFound = false;
        int subIndex = 0;
        int[] resultArr = new int[count];
        if (count > numbers.length) {
            System.out.println("Invalid count");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    resultArr[subIndex] = numbers[i];
                    subIndex++;
                    isFound = true;
                }
                if (subIndex >= count) {
                    break;
                }
            }
            if (isFound) {
                System.out.print("[");
                for (int i = 0; i < subIndex; i++) {
                    if (i == subIndex - 1) {
                        System.out.print(resultArr[i]);
                    } else {
                        System.out.print(resultArr[i] + ", ");
                    }
                }
                System.out.print("]");
                System.out.println();
            } else {
                System.out.println("[]");
            }
        }

    }
    public static void printFirstOdds(int[] numbers, int count) {
        boolean isFound = false;
        int subIndex = 0;
        int[] resultArr = new int[count];
        if (count > numbers.length) {
            System.out.println("Invalid count");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    resultArr[subIndex] = numbers[i];
                    subIndex++;
                    isFound = true;
                }
                if (subIndex >= count) {
                    break;
                }
            }
            if (isFound) {
                System.out.print("[");
                for (int i = 0; i < subIndex; i++) {
                    if (i == subIndex - 1) {
                        System.out.print(resultArr[i]);
                    } else {
                        System.out.print(resultArr[i] + ", ");
                    }
                }
                System.out.print("]");
                System.out.println();
            } else {
                System.out.println("[]");
            }
        }
    }

    public static void printLastEvens(int[] numbers, int count) {
        boolean isFound = false;
        int subIndex = 0;
        int[] resultArr = new int[count];
        if (count > numbers.length) {
            System.out.println("Invalid count");
        } else {
            for (int i = numbers.length - 1; i >= 0; i--) {
                if (numbers[i] % 2 == 0) {
                    resultArr[subIndex] = numbers[i];
                    subIndex++;
                    isFound = true;
                }
                if (subIndex >= count) {
                    break;
                }
            }
            if (isFound) {
                System.out.print("[");
                for (int i = subIndex - 1; i >= 0; i--) {
                    if (i == 0) {
                        System.out.print(resultArr[i]);
                    } else {
                        System.out.print(resultArr[i] + ", ");
                    }
                }
                System.out.print("]");
                System.out.println();
            } else {
                System.out.println("[]");
            }
        }

    }

    public static void printLastOdds(int[] numbers, int count) {
        boolean isFound = false;
        int subIndex = 0;
        int[] resultArr = new int[count];
        if (count > numbers.length) {
            System.out.println("Invalid count");
        } else {
            for (int i = numbers.length - 1; i >= 0; i--) {
                if (numbers[i] % 2 != 0) {
                    resultArr[subIndex] = numbers[i];
                    subIndex++;
                    isFound = true;
                }
                if (subIndex >= count) {
                    break;
                }
            }
            if (isFound) {
                System.out.print("[");
                for (int i = subIndex - 1; i >= 0; i--) {
                    if (i == 0) {
                        System.out.print(resultArr[i]);
                    } else {
                        System.out.print(resultArr[i] + ", ");
                    }
                }
                System.out.print("]");
                System.out.println();
            } else {
                System.out.println("[]");
            }
        }
    }
}
