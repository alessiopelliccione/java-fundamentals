package dataStructures;

import java.util.HashSet;
import java.util.Set;

public class CustomHashSet {

    // Initialize HashSet to store elements
    private Set<String> hashSet;

    // Constructor initializes the HashSet
    public CustomHashSet() {
        hashSet = new HashSet<>();
    }

    // Adds an element to the HashSet and returns if it was added (avoiding duplicates)
    public void addElement(String element) {
        boolean added = hashSet.add(element);
        System.out.println("Element " + element + " added: " + added);
    }

    // Removes an element from the HashSet if it exists
    public void removeElement(String element) {
        hashSet.remove(element);
    }

    // Checks if a specific element exists in the HashSet
    public boolean containsElement(String element) {
        return hashSet.contains(element);
    }

    // Displays all elements in the HashSet
    public void displayElements() {
        System.out.println("HashSet Elements: " + hashSet);
    }

    // Returns the size of the HashSet
    public int size() {
        return hashSet.size();
    }

}
