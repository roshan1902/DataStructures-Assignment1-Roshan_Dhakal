# DataStructures-Assignment1-Roshan Dhakal

## Student Information
- **Name**: Roshan Dhakal
- **Student ID**: C0916271

## Assignment Overview
This repository contains solutions for Assignment 1 of CSD 4464. The assignment consists of five coding challenges inspired by "Indiana Jones and the Template of Infinite Recursions" lab. Each challenge implements a different data structure and demonstrates basic operations for storing and managing elements.

## Challenges and Approaches
1. **The Array Artifact (`ArtifactVault.java`)**:
   - Implements an array to store ancient artifacts.
   - Methods include: adding an artifact, removing an artifact, linear search, and binary search.
   
2. **The Linked List Labyrinth (`LabyrinthPath.java`)**:
   - Uses a singly linked list to represent a path.
   - Methods include: adding a location, removing the last visited location, checking for loops, and printing the path.
   
3. **The Stack of Ancient Texts (`ScrollStack.java`)**:
   - Manages scrolls using a stack data structure.
   - Methods include: push, pop, peek, and check if a scroll exists in the stack.

4. **The Queue of Explorers (`ExplorerQueue.java`)**:
   - Implements a circular queue to manage explorers.
   - Methods include: enqueue, dequeue, displaying the next explorer, and checking if the queue is full or empty.
   
5. **The Binary Tree of Clues (`ClueTree.java`)**:
   - Represents a binary tree to store clues.
   - Methods include: insert a clue, perform in-order traversal, search for a clue, and count the total number of clues.

## Assumptions and Design Decisions
- The `ArtifactVault` assumes that the array will always be kept sorted for binary search operations.
- The `LabyrinthPath` uses a simple set-based approach to detect loops.
- The `ScrollStack` uses the built-in `Stack` class in Java.
- The `ExplorerQueue` assumes that the capacity is fixed and does not dynamically resize.
- The `ClueTree` is implemented as a binary search tree for storing unique clues.

## How to Run the Code
1. Clone this repository to your local machine using:
