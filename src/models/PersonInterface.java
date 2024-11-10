package models;

// Interface for Person-like objects
public interface PersonInterface {

    // Method to get the name
    String getName();

    // Method to set the name
    void setName(String name);

    // Method to get the age
    int getAge();

    // Method to set the age
    void setAge(int age);

    // Abstract method to display info, to be implemented in concrete classes
    void displayInfo();

}
