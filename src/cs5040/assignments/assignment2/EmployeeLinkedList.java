/*
 * Name:        Amrit Singh
 * Class:       CS 5040/W01
 * Term:        Fall 2025
 * Instructor:  Umama Tasnim
 * Assignment:  2
 */
package cs5040.assignments.assignment2;

/**
 *  This class is an implementation of a linked list for employees
 */
public class EmployeeLinkedList {

    // Member vars - empty list node of type employee
    private ListNode<Employee> head = null;

    // Constructor
    public EmployeeLinkedList() {

    }

    /**
     * This method adds a new employee to the list.
     *
     * @param emp Employee object
     */
    public void addEmployee(Employee emp) {
        // Create new employee list node
        ListNode<Employee> newNode = new ListNode<>(emp);

        // edge case
        if (head == null) {
            head = newNode;
        } else {
            // use pointer to traverse to end of list while also checking for unique id
            ListNode<Employee> pointer = head;
            while (pointer.getNext() != null) {
                if (!isUniqueID(pointer, emp)) {
                    System.out.println("Employee not added. ID is not unique!");
                    return;
                }
                pointer = pointer.getNext();
            }

            // check last node's ID
            if (!isUniqueID(pointer, emp)) {
                System.out.println("Employee not added. ID is not unique!");
                return;
            }

            // set next to the new node at end of list
            pointer.setNext(newNode);
        }
    }

    // Helper method to check for unique ID
    private boolean isUniqueID(ListNode<Employee> node, Employee employee) {
        return node.getData().getEmployeeID() != employee.getEmployeeID();
    }

    /**
     * This method deletes an employee by their ID.
     *
     * @param employeeID employee ID to delete
     */
    public void deleteEmployee(int employeeID) {

        // Edge case
        if (head == null) {
            System.out.println("There are no employees!");
        } else {
            // pointers
            ListNode<Employee> prev = head;
            ListNode<Employee> curr = head.getNext();
            while (curr != null) {
                // find node with id
                if (curr.getData().getEmployeeID() == employeeID) {
                    // set link of prev to curr's next as curr is the node to delete
                    prev.setNext(curr.getNext());
                    // destroy link of curr
                    curr.setNext(null);
                    break;
                } else {
                    prev = curr;
                    curr = curr.getNext();
                }
            }

            if (curr == null) {
                System.out.println("Could not find employee with employee id " + employeeID + "!");
            }
        }
    }

    /**
     * This method will display details of all employees in the list.
     *
     */
    public void displayEmployees() {
        // can also just System.out.println(head) to print out entire linked list since toString is implemented

        // Edge case
        if (head == null) {
            System.out.println("There are no employees!");
        } else {
            // create pointer so we don't lose head
            ListNode<Employee> pointer = head;
            while (pointer != null) {
                System.out.println(pointer.getData());
                pointer = pointer.getNext();
            }
        }
    }

    // Small program to test
    public static void main(String[] args) {
        EmployeeLinkedList el = new EmployeeLinkedList();
        el.displayEmployees();

        // Add employees
        el.addEmployee(new Employee(0, "Name0", "Position0", 0));
        el.addEmployee(new Employee(1, "Name1", "Position1", 1));
        el.addEmployee(new Employee(2, "Name2", "Position2", 2));
        el.addEmployee(new Employee(3, "Name3", "Position3", 3));
        el.displayEmployees();

        // Delete employee
        el.deleteEmployee(2);
        el.displayEmployees();

        // Delete employee at end of list
        el.addEmployee(new Employee(2, "Name2", "Position2", 2));
        el.displayEmployees();
        el.deleteEmployee(2);
        el.displayEmployees();

        // Edge case tests
        // 1. Try to add employee with negative salary
        try {
            el.addEmployee(new Employee(4, "Name4", "Position4", -5));
        } catch (Exception e) {
            System.out.println("Did not add employee");
        }

        // 2. Try to add employee with same id
        el.addEmployee(new Employee(2, "Name2", "Position2", 2));
        el.addEmployee(new Employee(2, "Name2", "Position2", 2));
        el.addEmployee(new Employee(1, "Name1", "Position1", 1));

        // 3. Try to delete employee not in list
        el.deleteEmployee(4);
    }
}
