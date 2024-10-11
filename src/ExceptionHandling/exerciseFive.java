package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Write a Java program that reads a file and throws an exception if the file is empty.
public class exerciseFive {
    public static void main(String[] args) {
        try {
            readFile("test1.txt");
            System.out.println("File is not empty");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException, EmptyFileException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        if (!scanner.hasNextLine()) {
            throw new EmptyFileException("Empty file");
        }
        scanner.close();
    }
}

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}
