package FileInputOutput;
//Write a Java program to compare two files lexicographically.
public class exerciseSix {
    public static void main(String[] args) {
        String text1 = "Some text";
        String text2 = "Some text";
        String text3 = "Even more text";

        int var1 = text1.compareTo(text2);
        System.out.println("text1 and text2 comparison: "+var1);
        int var2 = text2.compareTo(text3);
        System.out.println("text2 and text3 comparison: "+var2);
    }
}
