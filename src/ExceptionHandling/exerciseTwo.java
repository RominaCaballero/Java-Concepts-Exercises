package ExceptionHandling;
/* Write a Java program to create a method that takes an integer
 as a parameter and throws an exception if the number is odd.
 */
public class exerciseTwo {
    public static void main(String[] args) {
        int number = 2;
        takeInteger(number);
        number = 3;
        takeInteger(number);

    }
    public static void takeInteger(int number) {
        try {
            checkEvenNumber(number);
            System.out.println(number + " is even");
        } catch (IllegalArgumentException e) {
            System.out.println(number + " is odd");
        }
    }

    public static void checkEvenNumber(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is odd.");
        }
    }
}
