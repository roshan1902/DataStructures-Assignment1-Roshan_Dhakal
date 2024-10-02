package com.roshan.assingnment;

class TreeNode {
    String clue;
    TreeNode left, right;

    TreeNode(String clue) {
        this.clue = clue;
        left = right = null;
    }
}

public class ClueTree {
    private TreeNode root;

    public void insertClue(String clue) {
        root = insertRec(root, clue);
    }

    private TreeNode insertRec(TreeNode root, String clue) {
        if (root == null) {
            root = new TreeNode(clue);
            return root;
        }
        if (clue.compareTo(root.clue) < 0)
            root.left = insertRec(root.left, clue);
        else if (clue.compareTo(root.clue) > 0)
            root.right = insertRec(root.right, clue);
        return root;
    }

    public void inOrderTraversal() {
        inOrderRec(root);
    }

    private void inOrderRec(TreeNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.clue);
            inOrderRec(root.right);
        }
    }

    public boolean findClue(String clue) {
        return findClueRec(root, clue);
    }

    private boolean findClueRec(TreeNode root, String clue) {
        if (root == null) return false;
        if (root.clue.equals(clue)) return true;
        return clue.compareTo(root.clue) < 0 ? findClueRec(root.left, clue) : findClueRec(root.right, clue);
    }

    // Main method for testing ClueTree class
    public static void main(String[] args) {
        ClueTree tree = new ClueTree();
        tree.insertClue("Clue 1");
        tree.insertClue("Clue 2");
        tree.insertClue("Clue 0");
        System.out.println("In-order traversal of clues:");
        tree.inOrderTraversal();

        System.out.println("Finding 'Clue 1': " + tree.findClue("Clue 1"));
    }
}
