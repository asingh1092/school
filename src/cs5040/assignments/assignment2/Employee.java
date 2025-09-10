/*
 * Name:        Amrit Singh
 * Class:       CS 5040/W01
 * Term:        Fall 2025
 * Instructor:  Umama Tasnim
 * Assignment:  2
 */
package cs5040.assignments.assignment2;

/**
 * This is an employee model class.
 */
public class Employee {

    // Member vars
    private int employeeID; // must be unique
    private String name;
    private String position;
    private double salary; // always a positive number

    // Constructors
    public Employee(int employeeID, String name, String position, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;

        if (salary < 0) {
            throw new IllegalArgumentException("Cannot add an employee with a negative salary!");
        } else {
            this.salary = salary;
        }
    }


    // Getters and setters
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Cannot set salary to value less than 0!");
        } else {
            this.salary = salary;
        }
    }

    // toString implementation
    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
