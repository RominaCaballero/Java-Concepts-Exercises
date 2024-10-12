package FileInputOutput;

import java.io.File;

//Write a Java program to check if the given pathname is a directory or a file.
public class exerciseFive {
    public static void main(String[] args) {
        File file = new File("home/archives/archive");
        if(file.isDirectory()){
            System.out.println("is a directory");
        } else {
            System.out.println("is not a directory");
        }

        if(file.isFile()){
            System.out.println("is a file");
        } else {
            System.out.println("is not a file");
        }
    }
}
