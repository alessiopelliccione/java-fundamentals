package abstraction;

public class PersonImpl extends AbstractPerson {

    // Additional field to specify the role of the person
    private String role;

    // Constructor that initializes name, age, and role
    public PersonImpl(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    // Implementation of the abstract method from AbstractPerson
    @Override
    public void performRole() {
        System.out.println("Performing role as: " + role);
    }

    // Override printInfo to include role information
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Role: " + role);
    }

    @Override
    public void displayInfo() {
        printInfo();
    }
}
