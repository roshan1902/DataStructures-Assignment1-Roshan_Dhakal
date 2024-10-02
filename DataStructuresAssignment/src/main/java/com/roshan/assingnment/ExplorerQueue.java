package com.roshan.assingnment;

public class ExplorerQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    public ExplorerQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = size = 0;
        rear = capacity - 1;
    }

    public boolean enqueue(String explorer) {
        if (isFull()) return false;
        rear = (rear + 1) % capacity;
        queue[rear] = explorer;
        size++;
        return true;
    }

    public String dequeue() {
        if (isEmpty()) return null;
        String explorer = queue[front];
        front = (front + 1) % capacity;
        size--;
        return explorer;
    }

    public String peekFront() {
        return isEmpty() ? null : queue[front];
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Main method for testing ExplorerQueue class
    public static void main(String[] args) {
        ExplorerQueue queue = new ExplorerQueue(3);
        queue.enqueue("Explorer 1");
        queue.enqueue("Explorer 2");
        System.out.println("Next explorer in line: " + queue.peekFront());

        queue.dequeue();
        System.out.println("Next explorer after dequeue: " + queue.peekFront());
    }
}
