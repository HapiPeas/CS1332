


/*
Optimizations for SinglyLinkedLists(SLL)
1. Keep a size variable that keeps track of the current size of the list, that increments or decrements based after each operation
    - This can be used so that edge cases can be checked in constant [ O(1) ] time
2. Create both a head and tail pointer for the first and last nodes of the list, respectively
    - Adding to the back of the SLL becomes [ O(1) ] time since you don't have to iterate through the entire list
    - Does NOT help with removing from back
    - Adds edge cases for lists that are or become empty (size 0) or single-item (size 1) lists since (head pointer = tail pointer)
 */

public class SinglyLinkedList {
    /*
    Private inner node class with two constructors
    First constructor to accept an input with an integer(data) and a Node(next) the new Node should point to
    Second constructor to accept only an input with an integer(data) and point the new Node to null (end of SLL)
     */
    private class Node {
        private int data;
        private Node next;

        private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        private Node(int data) {
            this(data, null);
        }
    }

    /*
    Instance variable(s) of SinglyLinkedList class
     */
    private Node head;

    /*
    Add an integer(data) to the front of the SLL, making it the new head node
    Given an integer, a new node(newNode) will be created with the given data and pointing to null
    Then point the new node to the current first node(head) and then point the head node(head) to the new node(newNode)
     */
    public void addToFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /*
    toString() prints out the items within the SLL by iterating through the SLL
    Use a Node object(current) and point it at the head to start, so that the actual head Node(head) doesn't change
     */
    public String toString() {
        String answer = "";
        Node current = head;
        while(current != null) {
            answer += current + "";
            current = current.next;
        }
        return answer;
    }

    /*
    addToBack(int data) accepts an integer and creates a new node at the back of the SLL
    If the list is empty, a head node is created with the input data
    If the list is not empty, a temporary node(current) starts at the head Node(head) and iterates through the list until it reaches the last node
    current then points the last node to a new Node with input data
     */
    public void addToBack(int data) {
        if (head == null) { //List is empty
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    /*
    removeFromFront() removes the first node from the list by pointing the head Node(head) to the next node
    Java's garbage collection removes the original head node from memory since nothing is pointing to it and therefore, cannot be accessed
    */
    public void removeFromFront() {
        head = head.next();
    }

    /*
    removeFromBack() removes the last node in the list by pointing the node before the last node to null
    Java's garbage collection will remove the last node from memory since nothing is pointing to it and therefore, cannot be accessed
     */
    public void removeFromBack() {
        if (head == null) { //empty list
            return null;
        }
        else if (head.next == null) { //list with only one node
            head = null;
        }
        else {
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
}