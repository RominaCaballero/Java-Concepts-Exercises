package ExceptionHandling;
/*Write a Java program to create a method that takes a string as input
and throws an exception if the string does not contain vowels.
 */
public class exerciseSeven {
    public static void main(String[] args) {
        try{
            String text = "This is a test";
            System.out.println("Original string: " + text);
            checkIfContainsVowels(text);
            System.out.println("String contains vowels.");
        } catch(NoVowelsException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkIfContainsVowels(String text) throws NoVowelsException {
        boolean containsVowels = false;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (vowels.contains(String.valueOf(ch))) {
                containsVowels = true;
                break;
            }
        }
            if (!containsVowels) {
                throw new NoVowelsException("String does not contain any vowels.");
            }
    }
}

class NoVowelsException extends Exception{
    public NoVowelsException(String msg){
        super(msg);
    }
}

