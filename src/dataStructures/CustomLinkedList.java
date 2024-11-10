package dataStructures;

import java.util.LinkedList;
import java.util.List;

public class CustomLinkedList {

    // Initialize LinkedList to store elements
    private List<String> linkedList;

    // Constructor initializes the LinkedList
    public CustomLinkedList() {
        linkedList = new LinkedList<>();
    }

    // Adds an element to the LinkedList
    public void addElement(String element) {
        linkedList.add(element);
    }

    // Removes an element from the LinkedList if it exists
    public void removeElement(String element) {
        linkedList.remove(element);
    }

    // Gets the first element in the LinkedList
    public String getFirstElement() {
        return linkedList.getFirst();
    }

    // Gets the last element in the LinkedList
    public String getLastElement() {
        return linkedList.getLast();
    }

    // Displays all elements in the LinkedList
    public void displayElements() {
        System.out.println("LinkedList Elements: " + linkedList);
    }

    // Returns the size of the LinkedList
    public int size() {
        return linkedList.size();
    }

}
