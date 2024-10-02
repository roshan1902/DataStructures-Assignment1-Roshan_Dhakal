package com.roshan.assingnment;

import java.util.Arrays;

public class ArtifactVault {
    private String[] artifacts;
    private int count;

    // Constructor to initialize the array with a fixed size
    public ArtifactVault(int size) {
        artifacts = new String[size];
        count = 0;
    }

    public boolean addArtifact(String name) {
        if (count < artifacts.length) {
            artifacts[count++] = name;
            Arrays.sort(artifacts, 0, count);
            return true;
        }
        return false; 
    }

    public boolean removeArtifact(String name) {
        for (int i = 0; i < count; i++) {
            if (artifacts[i].equals(name)) {
                for (int j = i; j < count - 1; j++) {
                    artifacts[j] = artifacts[j + 1];
                }
                artifacts[--count] = null; 
                return true;
            }
        }
        return false; 
    }

    public int linearSearch(String name) {
        for (int i = 0; i < count; i++) {
            if (artifacts[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(String name) {
        int low = 0, high = count - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (artifacts[mid].equals(name)) {
                return mid;
            } else if (artifacts[mid].compareTo(name) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public void displayArtifacts() {
        for (int i = 0; i < count; i++) {
            System.out.print(artifacts[i] + " ");
        }
        System.out.println();
    }

    // Main method for testing ArtifactVault class
    public static void main(String[] args) {
        ArtifactVault vault = new ArtifactVault(5);
        vault.addArtifact("Amulet");
        vault.addArtifact("Sword");
        vault.addArtifact("Shield");
        vault.addArtifact("Helmet");
        System.out.println("Artifacts in the vault:");
        vault.displayArtifacts();

        System.out.println("Linear Search for 'Sword': " + vault.linearSearch("Sword"));
        System.out.println("Binary Search for 'Shield': " + vault.binarySearch("Shield"));
        
        vault.removeArtifact("Sword");
        System.out.println("Artifacts after removing 'Sword':");
        vault.displayArtifacts();
    }
}
