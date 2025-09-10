/*
 * Name:        Amrit Singh
 * Class:       CS 5040/W01
 * Term:        Fall 2025
 * Instructor:  Umama Tasnim
 * Assignment:  2
 */
package cs5040.assignments.assignment2;

/**
 *  This class describes a generic node data structure for lists
 */
public class ListNode<E> {

    // Member vars
    private E data;
    private ListNode<E> next = null;

    // Constructores
    public ListNode(E data) {
        this.data = data;
    }

    public ListNode(E data, ListNode<E> next) {
        this.data = data;
        this.next = next;
    }

    // Getters and Setters
    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public ListNode<E> getNext() {
        return next;
    }

    public void setNext(ListNode<E> next) {
        this.next = next;
    }

    // toString implementation
    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
