package models;

public class Person implements PersonInterface {

    // Private fields to demonstrate encapsulation
    private String name;
    private int age;

    // Public constructor to initialize fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 10) this.age = age;
    }

    // Protected method to show access within package/subclasses
    protected void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Overriding toString for easy display
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public void displayInfo() {
        printInfo();
    }

}
