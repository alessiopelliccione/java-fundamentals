package utilities;

import models.Person;
import models.Student;

public class InheritanceDemo {

    public void demonstrateInheritance() {
        // Base class instance
        Person person = new Person("John Doe", 30);
        System.out.println("Person Info:");
        person.displayInfo();

        // Derived class instances
        Student student = new Student("Alice", 20, "S1234");
        System.out.println("\nStudent Info:");
        student.displayInfo();

    }

}
