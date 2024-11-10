import models.Person;
import models.Student;

public class Main {
    public static void main(String[] args) {
        testPersonAndStudent();
    }

    // Method to test Person and Student classes
    private static void testPersonAndStudent() {
        // Create a Person instance
        Person person = new Person("John Doe", 30);
        System.out.println("Person Info:");
        person.displayInfo();

        // Create a Student instance
        Student student = new Student("Jane Doe", 20, "S12345");
        System.out.println("\nStudent Info:");
        student.displayInfo();

        // Demonstrating encapsulation by modifying properties through setters
        student.setAge(21);
        student.setName("Jane Smith");
        System.out.println("\nUpdated Student Info:");
        student.displayInfo();
    }

}