package utilities;

public class AccessModifiersExample {

    // Private variable, accessible only within this class
    private String privateVariable = "Private Variable";

    // Protected variable, accessible within the same package and subclasses
    protected String protectedVariable = "Protected Variable";

    // Public variable, accessible from anywhere
    public String publicVariable = "Public Variable";

    // Private method, accessible only within this class
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // Protected method, accessible within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    // Public method, accessible from anywhere
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Method to demonstrate all access modifiers within this class
    public void showAccess() {
        System.out.println(privateVariable);
        System.out.println(protectedVariable);
        System.out.println(publicVariable);
        privateMethod();
        protectedMethod();
        publicMethod();
    }

}
