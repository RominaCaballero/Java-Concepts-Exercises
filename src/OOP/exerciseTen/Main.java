package OOP.exerciseTen;

import java.util.ArrayList;

/*Write a Java program to create a class called "Student"
with a name, grade, and courses attributes,
and methods to add and remove courses.
 */
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("John", 2);
        Student student2 = new Student("Doe", 3);
        Student student3 = new Student("Jae", 2);

        ArrayList<Student> studentList = new ArrayList<>();

        System.out.println("This are the students in the list");
        student1.printStudentDetails();
        student2.printStudentDetails();
        student3.printStudentDetails();

        System.out.println("Adding the courses for each student---");

        student1.addCourse("Spanish");
        student1.addCourse("English");
        student1.addCourse("Math");

        student2.addCourse("English");
        student2.addCourse("Math");

        student3.addCourse("Physics");
        student3.addCourse("Calculus");

        System.out.println("This are the courses of each student!");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
        System.out.println(student2.getName() + "'s courses: " + student2.getCourses());
        System.out.println(student3.getName() + "'s courses: " + student3.getCourses());

        student1.removeCourse("English");
        student2.removeCourse("English");

        System.out.println("Oops! We are not gonna learn english this year... Removing the english courses---");
        System.out.println("This are the updated courses for our students!");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
        System.out.println(student2.getName() + "'s courses: " + student2.getCourses());
        System.out.println(student3.getName() + "'s courses: " + student3.getCourses());

    }
}
