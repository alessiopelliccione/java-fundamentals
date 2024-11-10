import dataStructures.CustomArrayList;
import dataStructures.CustomHashSet;
import dataStructures.CustomLinkedList;
import models.Person;
import models.Student;
import utilities.AccessModifiersExample;
import utilities.EncapsulationDemo;
import utilities.InheritanceDemo;
import utilities.PolymorphismDemo;

public class Main {
    public static void main(String[] args) {
        // Test Person and Student classes
        testPersonAndStudent();

        // Test CustomArrayList
        testCustomArrayList();

        // Test CustomLinkedList
        testCustomLinkedList();

        // Test CustomHashSet
        testCustomHashSet();

        // Test access modifiers
        AccessModifiersExample accessModifiersExample = new AccessModifiersExample();
        System.out.println("Access Modifiers Example:");
        accessModifiersExample.showAccess();

        // Test polymorphism
        PolymorphismDemo polymorphismDemo = new PolymorphismDemo();
        System.out.println("\nPolymorphism Demo:");
        polymorphismDemo.demonstratePolymorphism();

        // Test inheritance
        InheritanceDemo inheritanceDemo = new InheritanceDemo();
        System.out.println("\nInheritance Demo:");
        inheritanceDemo.demonstrateInheritance();

        // Test encapsulation
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo();
        System.out.println("\nEncapsulation Demo:");
        encapsulationDemo.demonstrateEncapsulation();
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

    // Method to test CustomArrayList functionality
    private static void testCustomArrayList() {
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.addElement("Apple");
        customArrayList.addElement("Banana");
        customArrayList.addElement("Cherry");
        customArrayList.displayElements();
    }

    // Method to test CustomLinkedList functionality
    private static void testCustomLinkedList() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.addElement("Dog");
        customLinkedList.addElement("Elephant");
        customLinkedList.addElement("Frog");
        customLinkedList.displayElements();
    }

    // Method to test CustomHashSet functionality
    private static void testCustomHashSet() {
        CustomHashSet customHashSet = new CustomHashSet();
        customHashSet.addElement("Giraffe");
        customHashSet.addElement("Hippo");
        customHashSet.addElement("Giraffe"); // Duplicate to test unique property
        customHashSet.displayElements();
    }

}