package com.homework_5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FixThisCode {

    public static FileWriter getFileWriter(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        return fileWriter;
    }

    public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++) {
            fileWriter.write(text + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        try {
            int howManyTimesToPrintTheTextToFile = Integer.parseInt(String.valueOf(scanner.nextInt()));
            String textToAdd = scanner.next();
            printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
        } catch (Exception e1) {
            System.out.println("Please, enter a number.");
        }


    }
}

