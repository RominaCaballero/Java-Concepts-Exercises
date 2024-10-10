package exerciseOne;
/*1. Write a Java program to create a class called "Person" with a name and age attribute.
Create two instances of the "Person" class, set their attributes using the constructor,
and print their name and age.
 */
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Roberta", 23);
        Person person2 = new Person("Mangolia", 54);

        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");

        // Modify the age of person1 using the setter methods
        person1.setAge(25);
        // Modify the name of person2 using the setter methods
        person2.setName("Priscila");

        System.out.println("Set new age and name:");
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");

    }
}
