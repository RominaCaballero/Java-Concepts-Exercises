package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Write a Java program to create a method
that reads a file and throws an exception if the file is not found.
 */
public class exerciseThree {
    public static void main(String[] args) {
        try {
            readFile("File.txt");
        } catch (FileNotFoundException e){
            System.out.println("File not found" + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }
}
