package OOP.exerciseSix;
/*Write a Java program to create a class called "Employee"
with a name, job title, and salary attributes,
and methods to calculate and update salary by a given percentage.
 */
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Matias", "Analista", 100);
        Employee employee2 = new Employee("Kento", "Supervisor", 200);

        System.out.println("\nEmployee Details:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();

        employee1.raiseSalary(10);
        employee2.raiseSalary(1);

        System.out.println("\nAfter raising salary:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();
    }
}
