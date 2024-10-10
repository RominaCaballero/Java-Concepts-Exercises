package exerciseNine;

import java.time.LocalDate;

/*Write a Java program to create a class called "Employee"
with a name, salary, and hire date attributes, and a method
to calculate years of service.
*/
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Carla", 2000, LocalDate.parse("2021-04-01"));
        Employee employee2 = new Employee("Sebastian", 1000, LocalDate.parse("2015-04-01"));
        Employee employee3 = new Employee("Jack", 5000, LocalDate.parse("2011-01-15"));

        employee1.printEmployeeDetails();

        // Print the years of service of employee1
        System.out.println("Years of Service: " + employee1.getYearsOfService());

        // Print the details of employee2
        employee2.printEmployeeDetails();

        // Print the years of service of employee2
        System.out.println("Years of Service: " + employee2.getYearsOfService());

        // Print the details of employee3
        employee3.printEmployeeDetails();

        // Print the years of service of employee3
        System.out.println("Years of Service: " + employee3.getYearsOfService());
    }

}
