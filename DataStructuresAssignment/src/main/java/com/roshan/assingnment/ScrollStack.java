package com.roshan.assingnment;

import java.util.Stack;

/**
 * The ScrollStack class manages a collection of scrolls using a stack.
 * It provides methods to push, pop, and peek at scrolls, and check if a scroll exists in the stack.
 */
public class ScrollStack {
    private Stack<String> stack;  // The stack to hold scrolls

    /**
     * Default constructor to initialize an empty stack of scrolls.
     */
    public ScrollStack() {
        stack = new Stack<>();
    }

    /**
     * Adds a new scroll to the top of the stack.
     * @param scroll The scroll to be added.
     */
    public void pushScroll(String scroll) {
        stack.push(scroll);
    }

    /**
     * Removes and returns the top scroll from the stack.
     * @return The top scroll if the stack is not empty; otherwise, returns null.
     */
    public String popScroll() {
        return stack.isEmpty() ? null : stack.pop();  // If stack is empty, return null
    }

    /**
     * Returns the top scroll without removing it from the stack.
     * @return The top scroll if the stack is not empty; otherwise, returns null.
     */
    public String peekScroll() {
        return stack.isEmpty() ? null : stack.peek();  // If stack is empty, return null
    }

    /**
     * Checks if a specific scroll exists in the stack.
     * @param title The title of the scroll to be searched for.
     * @return True if the scroll is found in the stack; otherwise, returns false.
     */
    public boolean containsScroll(String title) {
        return stack.contains(title);
    }

    /**
     * Main method for testing the ScrollStack class.
     * Demonstrates the usage of push, pop, peek, and contains methods.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create an instance of ScrollStack
        ScrollStack stack = new ScrollStack();

        // Push scrolls onto the stack
        stack.pushScroll("Ancient Scroll 1");
        stack.pushScroll("Ancient Scroll 2");

        // Peek at the top scroll and display it
        System.out.println("Top scroll (peek): " + stack.peekScroll());

        // Pop the top scroll off the stack and display the new top scroll
        stack.popScroll();
        System.out.println("Top scroll after pop (peek): " + stack.peekScroll());

        // Check if a specific scroll exists in the stack
        System.out.println("Stack contains 'Ancient Scroll 1': " + stack.containsScroll("Ancient Scroll 1"));
        System.out.println("Stack contains 'Ancient Scroll 3': " + stack.containsScroll("Ancient Scroll 3"));
    }
}
