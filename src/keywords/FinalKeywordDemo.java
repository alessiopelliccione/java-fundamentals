package keywords;

// Final class that cannot be inherited
public class FinalKeywordDemo {

    // Final variable (constant)
    public static final String CONSTANT = "I am constant";

    // Final method that cannot be overridden
    public final void showFinalMethod() {
        System.out.println("This is a final method and cannot be overridden.");
    }

    public void demonstrateFinal() {
        System.out.println(CONSTANT);

        // Attempting to modify a final variable will result in a compilation error
        // CONSTANT = "New Value"; // Uncommenting this line will cause an error
    }

}
