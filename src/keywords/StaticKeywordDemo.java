package keywords;

public class StaticKeywordDemo {

    // Static variable shared across all instances
    public static int counter = 0;

    // Static block that runs once when the class is loaded
    static {
        System.out.println("Static block executed. Initializing static variable.");
        counter = 100;
    }

    // Static method that can be called without an instance
    public static void showCounter() {
        System.out.println("Counter: " + counter);
    }

    // Non-static method to increment the counter
    public void incrementCounter() {
        counter++;
    }

}
