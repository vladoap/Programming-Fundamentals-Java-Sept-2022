package textProcessing.exercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //C:\Internal\training-internal\Template.pptx
        String lineInput = scan.nextLine();
        String[] inputArr = lineInput.split("\\\\");
        String[] fileInfo = inputArr[inputArr.length - 1].split("\\.");

        System.out.println("File name: " + fileInfo[0]);
        System.out.println("File extension: " + fileInfo[1]);
    }
}
