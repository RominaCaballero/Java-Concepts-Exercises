package FileInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Write a Java program to read input from the Java console.
public class exerciseEight {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name = reader.readLine();
        System.out.println("Your name is: " + name);
    }
}
