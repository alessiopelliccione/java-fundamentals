package utilities;

import models.Person;
import models.Student;

public class PolymorphismDemo {

    public void demonstratePolymorphism() {
        // Polymorphic use of Person type for Student
        Person person = new Person("Alessio", 22);
        Person student = new Student("Alice", 20, "S1234");

        // Using the displayInfo method which is overridden in each subclass
        System.out.println("Person Info:");
        person.displayInfo(); // Calls Person

        System.out.println("\nStudent Info:");
        student.displayInfo(); // Calls Student's implementation
    }

}
