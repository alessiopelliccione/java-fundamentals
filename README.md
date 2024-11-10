# Java Fundamentals Project

## Description
This project covers key concepts of Object-Oriented Programming (OOP) and Java fundamentals, focusing on preparing for technical interviews. The project aims to solidify knowledge of Java keywords, data structures, interfaces, and abstract classes, while practicing OOP principles.

## Project Goals
- Gain a comprehensive understanding of Object-Oriented Programming (OOP)
- Master differences among `HashSet`, `LinkedList`, `ArrayList`, and other Java data structures
- Study and apply access modifiers (`protected`, `private`, `public`)
- Familiarize with exception handling, the `final` keyword, interfaces, and abstract classes
- Practice essential Java keywords and prepare for common interview questions

## Topics Covered
1. Classes, objects, constructors, and abstract classes
2. Interfaces and polymorphism
3. Encapsulation, inheritance, polymorphism, and abstraction
4. Data structures: `ArrayList`, `LinkedList`, `HashSet`, `HashMap`
5. Access modifiers: `public`, `private`, `protected`
6. Exception handling with `try-catch-finally`
7. Keywords: `final`, `static`, `abstract`, `super`, `this`, `instanceof`, `try-catch-finally`

## Project Structure

### Class Descriptions

- **Main.java**: The main class to run the project and test all implemented features.

- **models/Person.java**: Base class representing a person, with fields like `name`, `age`, and methods to demonstrate encapsulation and access modifiers. Use this as a foundation for inheritance.

- **models/Student.java** and **models/Teacher.java**: Extend `Person` to show inheritance and apply polymorphism. Add specific fields and methods for each.

- **models/PersonInterface.java**: Interface that defines basic methods for `Person`-like objects. Use this to demonstrate the implementation of interfaces and how they differ from abstract classes.

- **dataStructures/CustomArrayList.java**: Custom version of `ArrayList` to explore the properties of this data structure and explain differences with `LinkedList`.

- **dataStructures/CustomLinkedList.java**: Basic implementation of `LinkedList` to show how it differs from `ArrayList`.

- **dataStructures/CustomHashSet.java**: Class to demonstrate the unique properties of `HashSet`, especially duplicate handling and `hashCode`.

- **utilities/AccessModifiersExample.java**: Demonstrates `private`, `protected`, and `public` usage, showing the contexts in which each modifier is accessible.

- **utilities/PolymorphismDemo.java**: Shows examples of polymorphism using methods of `Student` and `Teacher` classes with instances of type `Person`.

- **utilities/InheritanceDemo.java**: Demonstrates how inheritance works among `Person`, `Student`, and `Teacher`.

- **utilities/EncapsulationDemo.java**: Provides examples of getters and setters, demonstrating encapsulation.

- **keywords/FinalKeywordDemo.java**: Demonstrates the `final` keyword with variables, methods, and classes, showing its role in creating constants and preventing inheritance or overriding.

- **keywords/StaticKeywordDemo.java**: Contains examples of static fields, methods, and static blocks, explaining when and why they are used.

- **keywords/AbstractClassExample.java**: Shows how to define and use an abstract class, including both abstract and concrete methods.

- **keywords/SuperAndThisDemo.java**: Demonstrates the `super` and `this` keywords for calling parent class constructors or methods, and referring to the current class instance.

- **keywords/InstanceofDemo.java**: Examples of the `instanceof` keyword, used to check object types and ensure safe casting.

- **keywords/ExceptionHandlingDemo.java**: Covers exception handling basics with `try-catch-finally` blocks, demonstrating how to use `finally` for resource cleanup.

- **abstraction/AbstractPerson.java**: An abstract class extending `PersonInterface` that includes both concrete and abstract methods. Demonstrates abstraction by combining interface and abstract class functionality.

- **abstraction/PersonImpl.java**: A concrete implementation of `AbstractPerson` that provides implementations for all abstract methods in `AbstractPerson` and methods defined in `PersonInterface`.