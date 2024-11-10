package models;

// Importing Person class
public class Student extends Person {

    // Specific field for Student class
    private String studentId;

    // Constructor that calls the superclass (Person) constructor
    public Student(String name, int age, String studentId) {
        super(name, age); // Calling the constructor of Person
        this.studentId = studentId;
    }

    //Getter and Setter
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Overriding the printInfo method from Person class to add student-specific information
    @Override
    protected void printInfo() {
        super.printInfo(); // Calling the parent class method
        System.out.println("Student ID: " + studentId);
    }

    // Overriding toString to include studentId in the display
    @Override
    public String toString() {
        return "Student{name='" + getName() + "', age=" + getAge() + ", studentId='" + studentId + "'}";
    }

    public void displayInfo() {
        printInfo();
    }

}
