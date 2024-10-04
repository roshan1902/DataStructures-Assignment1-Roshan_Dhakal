# DataStructures-Assignment1-Roshan Dhakal

## Student Information
- **Name**: Roshan Dhakal
- **Student ID**: C0916271

## Assignment Overview
The CSD 4464 Assignment 1 solutions are available in this repository. Five code problems comprise the assignment, which draws inspiration from the "Indiana Jones and the Template of Infinite Recursions" lab. Every challenge highlights fundamental processes for storing and managing items while implementing a distinct data structure.

## Challenges and Approaches
1. **The Array Artifact (`ArtifactVault.java`)**:
   - Implements an array to store ancient artifacts.
   - There are other techniques, such as binary search, linear search, and artefact addition and removal.
   
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
1. Clone this repository to your local machine using:git clone
   https://github.com/roshan1902/DataStructures-Assignment1-Roshan_Dhakal
3. Open the project in your preferred IDE.
4. Run each class's `main` method individually to test the functionality.
5. Each class file contains its own `main` method for demonstration and testing purposes.
