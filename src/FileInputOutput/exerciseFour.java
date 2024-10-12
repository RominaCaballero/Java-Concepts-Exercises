package FileInputOutput;

import java.io.File;

//Write a Java program to check if a file or directory has read and write permissions.
public class exerciseFour {
    public static void main(String[] args) {
        File file = new File("/home/archives/");
        if (file.canRead()) {
            System.out.println(file.getAbsolutePath() + " is readable");
        } else {
            System.out.println(file.getAbsolutePath() + " is not readable");
        }

        if (file.canWrite()) {
            System.out.println(file.getAbsolutePath() + " can write");
        } else {
            System.out.println(file.getAbsolutePath() + " cannot write");
        }
    }
}
