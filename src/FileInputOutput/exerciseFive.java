package FileInputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exerciseFive {
    public static void main(String[] args) {
        String filePath = "data.txt";  // Path to your file

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line until there are no more lines
            while ((line = reader.readLine()) != null) {
                // Split the line into parts using a comma as the delimiter
                String[] parts = line.split(", ");

                // Extract each part into respective variables
                String firstName = parts[0];     // First part
                String lastName = parts[1];      // Second part
                int age = Integer.parseInt(parts[2]);       // Third part (converted to int)
                int birthYear = Integer.parseInt(parts[3]); // Fourth part (converted to int)

                // Print each part individually
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Age: " + age);
                System.out.println("Birth Year: " + birthYear);
                System.out.println(); // Add an empty line for better readability
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file \"" + filePath + "\" was not found.");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: One of the lines in the file does not have enough data.");
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid number format in the file. " + e.getMessage());
        }
    }
}
