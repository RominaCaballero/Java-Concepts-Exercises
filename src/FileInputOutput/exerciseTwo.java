package FileInputOutput;
//Write a Java program to get specific files with extensions from a specified folder.

import java.io.File;
import java.io.FilenameFilter;

public class exerciseTwo {
    public static void main(String[] args) {
        File file = new File("/home/somewhere");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".txt")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}
