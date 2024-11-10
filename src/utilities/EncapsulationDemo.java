package utilities;

import models.Person;

public class EncapsulationDemo {

    public void demonstrateEncapsulation() {
        // Creating a Person instance
        Person person = new Person("Emily Clark", 25);

        // Accessing data through getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying data through setters
        person.setName("Emma Watson");
        person.setAge(30);

        // Accessing updated data through getters
        System.out.println("\nUpdated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

    }

}
