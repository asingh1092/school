/*
 * Name:        Amrit Singh
 * Class:       CS 5040/W01
 * Term:        Fall 2025
 * Instructor:  Umama Tasnim
 * Assignment:  2
 */
package cs5040.assignments.assignment2;

import java.util.Scanner;

/**
 * This class mimics an employee management system with 4 main functions:

 * 1. Adding a new employee (must be valid)
 * 2. Deleting an employee
 * 3. Displaying all employees
 * 4. Exiting the program.
 *
 * It allows user to add input and select the system functions a la menus
 */
public class EmployeeManagementSystem {

    // Main method of the EMS
    public static void main(String[] args) {
        // Instantiate member vars
        String again = "y";
        Scanner s = new Scanner(System.in);
        EmployeeLinkedList el = new EmployeeLinkedList();

        while (again.equalsIgnoreCase("y")) {

            // Get input from user on what menu choice they want
            System.out.println("Please select from the following options by entering in either a 1, 2, 3 for the respective choices:");
            System.out.println("\t1. Add a new employee");
            System.out.println("\t2. Delete an employee");
            System.out.println("\t3. Display all employees");
            System.out.print("Selected option: ");

            int value = s.nextInt();
            s.nextLine(); // clear buffer

            // Give menu options to user
            switch (value) {
                case 1:
                    System.out.println("Please input data for an employee:");
                    System.out.print("Please enter a unique id for the employee as an integer: ");
                    int employeeId = s.nextInt();
                    s.nextLine(); // clear buffer

                    System.out.print("Please enter the employee's name as a String: ");
                    String name = s.nextLine();

                    System.out.print("Please enter the employee's position as a String: ");
                    String position = s.nextLine();

                    System.out.print("Please enter the employee's salary as a double: ");
                    double salary = s.nextDouble();
                    s.nextLine(); // clear buffer

                    while (salary < 0) {
                        System.out.print("Please enter a positive value for the employee's salary: ");
                        salary = s.nextDouble();
                        s.nextLine(); // clear buffer
                    }
                    el.addEmployee(new Employee(employeeId, name, position, salary));
                    break;
                case 2:
                    System.out.print("Please input an employee ID (as an integer) to delete: ");
                    int id = s.nextInt();
                    s.nextLine(); // clear buffer

                    System.out.println("Deleting employee with id " + id);
                    el.deleteEmployee(id);
                    break;
                case 3:
                    System.out.println("Displaying all employees...");
                    el.displayEmployees();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Select another option? (y/n): ");
            again = s.nextLine();
        }
    }
}
