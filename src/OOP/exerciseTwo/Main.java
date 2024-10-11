package OOP.exerciseTwo;

/* 2. Write a Java program to create a class called "Dog" with a name and breed attribute.
 Create two instances of the "Dog" class, set their attributes using the constructor and
 modify the attributes using the setter methods and print the updated values.
 */
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Firulais", "Pastor Aleman");
        Dog dog2 = new Dog("Lula", "Caniche");

        System.out.println("These are the dogs!");
        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());

        dog1.setName("Sasha");
        dog2.setBreed("Delmer");

        System.out.println("These are the modified attributes!");
        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());
    }
}
