package FileInputOutput.excersiceOne;

import java.io.File;
import java.util.Date;

//Write a Java program to get a list of all file/directory names in the given directory.
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\guest1\\Documents\\js-basics");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}
