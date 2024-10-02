package com.roshan.assingnment;

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

    public boolean containsLoop() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

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
        path.printPath();

        path.removeLastLocation();
        System.out.println("Path after removing last location:");
        path.printPath();
    }
}
