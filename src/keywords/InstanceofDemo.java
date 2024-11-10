package keywords;

import models.Person;
import models.Student;

public class InstanceofDemo {

    public void demonstrateInstanceof(Person person) {
        if (person instanceof Student) {
            System.out.println("This person is a Student.");
        } else {
            System.out.println("This person is a generic Person.");
        }
    }
}