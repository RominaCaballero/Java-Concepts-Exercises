package exerciseThree;
/*Write a Java program to create a class called "Rectangle"
with width and height attributes.
Calculate the area and perimeter of the rectangle.
 */
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(7, 12);

        System.out.println("The area of the rectangle is " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());

        // Set a new width for the rectangle
        rectangle.setWidth(6);
        // Set a new height for the rectangle
        rectangle.setHeight(12);

        System.out.println("Now the area of the rectangle is " + rectangle.getArea());
        System.out.println("Now the perimeter of the rectangle is " + rectangle.getPerimeter());
    }
}
