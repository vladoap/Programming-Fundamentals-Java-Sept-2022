package Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05KaminoFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lengthSequence = Integer.parseInt(scan.nextLine());
        String currentSequence = scan.nextLine();
        int bestSequenceIndex = Integer.MIN_VALUE;
        int bestSequenceSum = Integer.MIN_VALUE;
        int bestSequenceLength = Integer.MIN_VALUE;
        int bestLine = 0;
        int[] bestSequenceArr = new int[lengthSequence];
        int currentLine = 1;


        while (!currentSequence.equals("Clone them!")) {
            int[] sequenceArr = Arrays
                    .stream(currentSequence.split("!+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int currentIndex = Integer.MIN_VALUE;
            int currentLength = Integer.MIN_VALUE;
            int currentSubLength = 0;
            int currentSubIndex = 0;
            boolean isOne = false;
             // проверка по условия за най-добра последователност в текущ ред.
            for (int position = 0; position < sequenceArr.length; position++) {
                // когато предното число е било 1-ца и текущото също е 1-ца
                if (sequenceArr[position] == 1 && isOne) {
                    currentSubLength++;
                    //  условие, когато предното число не е било 1-ца и текущото е 1-ца
                } else if (sequenceArr[position] == 1 && !isOne) {
                    currentSubLength++;
                    currentSubIndex = position;
                    isOne = true;
                    // предното число е било 1-ца и текущото е 0-ла
                } else if (sequenceArr[position] == 0 && isOne ) {
                        if (currentSubLength > currentLength) {
                            currentLength = currentSubLength;
                            currentIndex = currentSubIndex;
                        }
                    isOne = false;
                    currentSubLength = 0;
                    currentSubIndex = 0;
                }
                }
              if (isOne) {  // проверка в случай, че числата са само 1-ци
                  if (currentSubLength > currentLength) {
                      currentLength = currentSubLength;
                      currentIndex = currentSubIndex;
                  }
              }
               // Проверка по условия за отделни редове с данни.
              if (currentLength > bestSequenceLength) {
                  bestSequenceLength = currentLength;    // най-голяма последователност от 1-ци
                  bestSequenceIndex = currentIndex;      // най-добър индекс
                  bestSequenceArr = sequenceArr;         // най-добър масив
                  bestLine = currentLine;                      // най-добър семпъл (номер на ред)
                  bestSequenceSum = Arrays.stream(sequenceArr).sum();

              } else if (currentLength == bestSequenceLength) {
                  if (currentIndex < bestSequenceIndex) {
                      bestSequenceLength = currentLength;    // най-голяма последователност от 1-ци
                      bestSequenceIndex = currentIndex;      // най-добър индекс
                      bestSequenceArr = sequenceArr;         // най-добър масив
                      bestLine = currentLine;                      // най-добър семпъл (номер на ред)
                      bestSequenceSum = Arrays.stream(sequenceArr).sum();
                  } else if (currentIndex == bestSequenceIndex) {
                        if (Arrays.stream(sequenceArr).sum() > bestSequenceSum) {
                            bestSequenceLength = currentLength;    // най-голяма последователност от 1-ци
                            bestSequenceIndex = currentIndex;      // най-добър индекс
                            bestSequenceArr = sequenceArr;         // най-добър масив
                            bestLine = currentLine;                      // най-добър семпъл (номер на ред)
                            bestSequenceSum = Arrays.stream(sequenceArr).sum();
                        }
                  }
              }
            currentLine++;
            currentSequence = scan.nextLine();
            }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestLine, bestSequenceSum);
        for (int element : bestSequenceArr) {
            System.out.print(element + " ");
        }

        }

    }


