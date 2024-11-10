package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList {

    // Initialize ArrayList to store elements
    private List<String> arrayList;

    // Constructor initializes the ArrayList
    public CustomArrayList() {
        arrayList = new ArrayList<>();
    }

    // Adds an element to the ArrayList
    public void addElement(String element) {
        arrayList.add(element);
    }

    // Removes an element from the ArrayList if it exists
    public void removeElement(String element) {
        arrayList.remove(element);
    }

    // Gets an element at a specified index in the ArrayList
    public String getElement(int index) {
        return arrayList.get(index);
    }

    // Displays all elements in the ArrayList
    public void displayElements() {
        System.out.println("ArrayList Elements: " + arrayList);
    }

    // Returns the size of the ArrayList
    public int size() {
        return arrayList.size();
    }

}
