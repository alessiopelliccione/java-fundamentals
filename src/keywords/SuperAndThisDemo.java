package keywords;

class BaseClass {
    public String message = "Hello from BaseClass";

    public void displayMessage() {
        System.out.println(message);
    }
}

public class SuperAndThisDemo extends BaseClass {
    public String message = "Hello from SuperAndThisDemo";

    public SuperAndThisDemo() {
        super(); // Calls the parent class constructor
    }

    public void displayBothMessages() {
        System.out.println("Current class message: " + this.message); // Refers to current class variable
        System.out.println("Parent class message: " + super.message); // Refers to parent class variable
    }
}
