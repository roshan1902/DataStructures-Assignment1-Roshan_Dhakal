package com.roshan.assingnment;

import java.util.Stack;

public class ScrollStack {
    private Stack<String> stack;

    public ScrollStack() {
        stack = new Stack<>();
    }

    public void pushScroll(String scroll) {
        stack.push(scroll);
    }

    public String popScroll() {
        return stack.isEmpty() ? null : stack.pop();
    }

    public String peekScroll() {
        return stack.isEmpty() ? null : stack.peek();
    }

    public boolean containsScroll(String title) {
        return stack.contains(title);
    }

    // Main method for testing ScrollStack class
    public static void main(String[] args) {
        ScrollStack stack = new ScrollStack();
        stack.pushScroll("Ancient Scroll 1");
        stack.pushScroll("Ancient Scroll 2");
        System.out.println("Top scroll (peek): " + stack.peekScroll());

        stack.popScroll();
        System.out.println("Top scroll after pop (peek): " + stack.peekScroll());
    }
}
