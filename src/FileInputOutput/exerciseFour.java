package FileInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class exerciseFour {
    public static void main(String[] args) {
        String filePath = "output.txt";  // Output file
        String data = "This is a line of text.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
            writer.newLine();  // Move to the next line
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
