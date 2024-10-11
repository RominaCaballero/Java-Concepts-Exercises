package OOP.exerciseFour;
/*Write a Java program to create a class called "Circle"
with a radius attribute.
You can access and modify this attribute.
Calculate the area and circumference of the circle.
 */
public class Main {
    public static void main(String[] args) {

        int r = 5;
        Circle circle = new Circle(r);

        System.out.println("Radius of the circle is " + r);
        System.out.println("This is the area of the circle: " + circle.getArea() + " and this is the circumference: " + circle.getCircumference());

        System.out.println("This is the changed circle!");

        r = 8;
        circle.setRadius(r);
        System.out.println("Radius of the circle is " + r);
        System.out.println("The area is: " + circle.getArea() + " and the circumference is: " + circle.getCircumference());


    }
}
