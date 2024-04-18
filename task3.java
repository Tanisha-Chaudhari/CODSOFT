package intershiptasks;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'text' to input text or 'file' to input a file:");
        String inputType = scanner.nextLine().toLowerCase();

        String text = "";
        if (inputType.equals("text")) {
            System.out.println("Enter the text:");
            text = scanner.nextLine();
        } else if (inputType.equals("file")) {
            System.out.println("Enter the path to the file:");
            String filePath = scanner.nextLine();
            try {
                text = readFile(filePath);
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
                return;
            }
        } else {
            System.err.println("Invalid input type.");
            return;
        }

        String[] words = text.split("[\\s\\p{Punct}]+");
        int wordCount = words.length;
        System.out.println("Total word count: " + wordCount);
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner fileScanner = new Scanner(new File(filePath));
        while (fileScanner.hasNextLine()) {
            sb.append(fileScanner.nextLine()).append("\n");
        }
        fileScanner.close();
        return sb.toString();
    }
}

