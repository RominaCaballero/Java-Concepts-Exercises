package OOP.exerciseEight;
/*Write a Java program to create class called "TrafficLight"
 with attributes for color and duration,
 and methods to change the color and check for red or green.
 */
public class Main {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("red",60);
        // Print whether the traffic light is red
        System.out.println("The light is red: " + light.isRed());

        // Print whether the traffic light is green
        System.out.println("The light is green: " + light.isGreen());

        // Change the color of the traffic light to "green"
        light.changeColor("green");

        // Print whether the traffic light is now green
        System.out.println("The light is now green: " + light.isGreen());

        // Print the duration of the traffic light
        System.out.println("The light duration is: " + light.getDuration());

        // Set a new duration for the traffic light to 20 seconds
        light.setDuration(20);

        // Print the updated duration of the traffic light
        System.out.println("The light duration is now: " + light.getDuration());
    }
}
