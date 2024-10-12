package FileInputOutput;

import java.io.File;

//Write a Java program to check if a file or directory specified by pathname exists or not.
public class exerciseThree {
    public static void main(String[] args) {
        File file = new File("/home/path");
        if(file.exists()){
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
    }
}
