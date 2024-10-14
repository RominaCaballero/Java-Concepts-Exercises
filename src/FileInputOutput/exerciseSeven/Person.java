package FileInputOutput.exerciseSeven;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int birthYear;

    // Constructor
    public Person(String firstName, String lastName, int age, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthYear = birthYear;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
