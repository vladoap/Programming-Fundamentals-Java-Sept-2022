package Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06LadyBugs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scan.nextLine());
        int[] initialBugsIndex = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] currentBugsPositionArr = new int[fieldSize];
        boolean isValid = false;// позиция на бръмбърите
            for (int i = 0; i < initialBugsIndex.length; i++) {


                if (initialBugsIndex[i] >= 0 && initialBugsIndex[i] < currentBugsPositionArr.length ) {
                    currentBugsPositionArr[initialBugsIndex[i]] = 1;
                }
            }
        for(int item : currentBugsPositionArr) {
            if (item == 1) {
                isValid = true;
                break;
            }
        }
        String input = scan.nextLine();
        while (!input.equals("end") && isValid) {
            int currentBugIndex = Integer.parseInt(input.split(" ")[0]);
            int flyLength = Integer.parseInt(input.split(" ")[2]);
            boolean isBug = false;
            boolean freePos = true;

            if (currentBugIndex < 0 || currentBugIndex >= currentBugsPositionArr.length) {
                input = scan.nextLine();
                continue;
            }

            if (currentBugIndex >= fieldSize) {
                input = scan.nextLine();
                continue;
            }

                if (currentBugsPositionArr[currentBugIndex] == 1) {
                    isBug = true;

                }

            if (!isBug) {
                input = scan.nextLine();
                continue;
            }
            int flyLengthAbs = Math.abs(flyLength);
            if ((input.contains("right") && flyLength >= 0) || (input.contains("left") && flyLength < 0)) {
                if (currentBugIndex + flyLengthAbs < currentBugsPositionArr.length && currentBugIndex + flyLengthAbs >= 0) {
                    if (currentBugsPositionArr[currentBugIndex + flyLengthAbs] == 0) {
                        currentBugsPositionArr[currentBugIndex + flyLengthAbs] = 1;
                        currentBugsPositionArr[currentBugIndex] = 0;
                    } else if (currentBugsPositionArr[currentBugIndex + flyLengthAbs] == 1) {
                        freePos = false;
                        int initialBugIndex = currentBugIndex;
                        while (!freePos) {
                            if (currentBugIndex + flyLengthAbs >= currentBugsPositionArr.length) {
                                break;
                            }
                            if (currentBugsPositionArr[currentBugIndex + flyLengthAbs] == 1) {
                                currentBugIndex += flyLengthAbs;
                            } else {
                                currentBugsPositionArr[currentBugIndex + flyLengthAbs] = 1;
                                freePos = true;
                            }
                        }
                        currentBugsPositionArr[initialBugIndex] = 0;
                    }

                } else {
                    currentBugsPositionArr[currentBugIndex] = 0;
                }
            } else if ((input.contains("left") && flyLength >= 0) || (input.contains("right") && flyLength < 0)) {
                if (currentBugIndex - flyLengthAbs >= 0 && currentBugIndex - flyLengthAbs < currentBugsPositionArr.length) {
                    if (currentBugsPositionArr[currentBugIndex - flyLengthAbs] == 0) {
                        currentBugsPositionArr[currentBugIndex - flyLengthAbs] = 1;
                        currentBugsPositionArr[currentBugIndex] = 0;
                    } else if (currentBugsPositionArr[currentBugIndex - flyLengthAbs] == 1) {
                        freePos = false;
                        int initialBugIndex = currentBugIndex;
                        while (!freePos) {
                            if (currentBugIndex - flyLengthAbs < 0) {
                                break;
                            }

                            if (currentBugsPositionArr[currentBugIndex - flyLengthAbs] == 1) {
                                currentBugIndex -= flyLengthAbs;
                            } else {
                                currentBugsPositionArr[currentBugIndex - flyLengthAbs] = 1;
                                freePos = true;
                            }
                        }
                        currentBugsPositionArr[initialBugIndex] = 0;
                    }

                } else {
                    currentBugsPositionArr[currentBugIndex] = 0;
                }
            }
         input = scan.nextLine();
        }
       if (isValid) {
           for (int item : currentBugsPositionArr) {
               System.out.print(item + " ");
           }
       }
    }
}
