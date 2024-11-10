package abstraction;

import models.PersonInterface;

// Abstract class that implements PersonInterface
public abstract class AbstractPerson implements PersonInterface {
    protected String name;
    protected int age;

    // Constructor for setting up name and age
    public AbstractPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Concrete method that can be used directly or overridden by subclasses
    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Abstract method to be implemented by subclasses
    public abstract void performRole();

    // Implementing methods from PersonInterface
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

}
