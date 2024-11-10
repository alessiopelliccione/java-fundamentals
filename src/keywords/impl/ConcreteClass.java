package keywords.impl;

import keywords.AbstractClassExample;

// Subclass that provides implementation for the abstract method
public class ConcreteClass extends AbstractClassExample {
    @Override
    public void performAction() {
        System.out.println("Performing action in the concrete subclass.");
    }
}