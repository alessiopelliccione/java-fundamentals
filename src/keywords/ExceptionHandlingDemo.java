package keywords;

public class ExceptionHandlingDemo {

    public void demonstrateExceptionHandling() {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed. Resource cleanup can be done here.");
        }
    }
}
