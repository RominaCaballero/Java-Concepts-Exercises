package FileInputOutput;

import java.io.File;

//Write a Java program to get the file size in bytes, KB, MB.
public class exerciseNine {
    public static void main(String[] args) {
        File file = new File("/home/archives/archive.txt");
        if(file.exists()) {
            System.out.println(filesize_in_Bytes(file));
            System.out.println(filesize_in_kiloBytes(file));
            System.out.println(filesize_in_megaBytes(file));
        } else System.out.println("File doesn't exist");

    }

    private static String filesize_in_megaBytes(File file) {
        return (double) file.length()/(1024*1024)+" mb";
    }

    private static String filesize_in_kiloBytes(File file) {
        return (double) file.length()/1024+"  kb";
    }

    private static String filesize_in_Bytes(File file) {
        return file.length()+" bytes";
    }

}
