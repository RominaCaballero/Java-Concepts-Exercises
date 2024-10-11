package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Write a Java program that reads a list of numbers from a file
and throws an exception if any of the numbers are positive
 */
public class exerciseFour {
    public static void main(String[] args) {
      try {
          checkNumbersFromFile("test.txt");
            System.out.println("No numbers are positive");
      } catch (FileNotFoundException e){
          System.out.println("Error: " + e.getMessage());
      } catch (PostiveNumberException e){
          System.out.println("Error: " + e.getMessage());
      }

    }

    public static void checkNumbersFromFile(String fileName) throws FileNotFoundException, PostiveNumberException {
        Scanner sc = new Scanner(new File(fileName));
        File file = new File(fileName);
        while (sc.hasNextLine()) {
            int number = Integer.parseInt(sc.nextLine());
            if (number > 0 ){
                throw new PostiveNumberException("Positive number found: " + number);
            }
        }
    }
}

class PostiveNumberException extends Exception {
    public PostiveNumberException(String message) {
        super(message);
    }
}