package FileInputOutput;

import java.io.File;
import java.util.Date;

//Write a Java program to determine the last modified date of a file.
public class exerciseSeven {
    public static void main(String[] args) {
        File file = new File("/home/archives/archive.txt");
        Date date = new Date(file.lastModified());
        System.out.println("The last modification was on: " + date);
    }
}
