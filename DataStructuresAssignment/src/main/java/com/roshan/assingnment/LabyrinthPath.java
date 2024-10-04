package com.roshan.assignment;

import java.util.HashSet;

public class LabyrinthPath {
    private Node head;

    // Node class representing a single element in the linked list
    class Node {
        String location;
        Node next;

        Node(String location) {
            this.location = location;
            this.next = null;
        }
    }

    // Adds a new location to the end of the path
    public void addLocation(String location) {
        Node newNode = new Node(location);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Removes the last visited location from the path
    public void removeLastLocation() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    // Simplified method to detect if the path contains a loop using a set
    public boolean containsLoop() {
        HashSet<Node> visitedNodes = new HashSet<>();  // Set to track visited nodes
        Node temp = head;

        // Traverse the list and check for duplicates
        while (temp != null) {
            if (visitedNodes.contains(temp)) {  // If the node is already visited, there's a loop
                return true;
            }
            visitedNodes.add(temp);  // Add current node to the set
            temp = temp.next;  // Move to the next node
        }
        return false;  // No loop found
    }

    // Prints the entire path of locations
    public void printPath() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.location + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    // Main method for testing LabyrinthPath class
    public static void main(String[] args) {
        LabyrinthPath path = new LabyrinthPath();
        path.addLocation("Entrance");
        path.addLocation("Hallway");
        path.addLocation("Treasure Room");

        // Creating a loop manually for testing
        path.head.next.next.next = path.head;  // Hallway -> Entrance loop

        path.printPath();
        System.out.println("Path contains a loop: " + path.containsLoop());
    }
}
