package ExceptionHandling;

import java.util.*;

/* Write a Java program that reads a list of integers from the user and throws an
exception if any numbers are duplicates.
 */
public class exerciseSix {
    public static void main(String[] args) {
        try{
            List<Integer> numbers = readNumbersFromUser();
            checkDuplicates(numbers);
            System.out.println("No duplicate numbers");
        } catch(DuplicateNumbersException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static List<Integer> readNumbersFromUser() {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you wanna input? ");
        int number = scanner.nextInt();

        System.out.print("Input the integers bby:\n");
        for (int i = 0; i < number; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
        scanner.close();
        return numbers;
    }
    public static void checkDuplicates(List<Integer> numbers) throws DuplicateNumbersException {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for(int number : numbers) {
            if (uniqueNumbers.contains(number)) {
                throw new DuplicateNumbersException("Duplicate number: " + number);
            }
            uniqueNumbers.add(number);
        }
    }
}

class DuplicateNumbersException extends Exception {
    public DuplicateNumbersException(String message) {
        super(message);
    }
}
