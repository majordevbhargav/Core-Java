import java.util.logging.Logger;

// Abstract Class: Serves as a template.
// It cannot be instantiated directly without an implementation.
abstract class Role {
    // Abstract Method: Has no body and must be implemented on-the-fly or by a
    // subclass.
    abstract void postion();
}

public class AnonymousClass {
    // Logger Initialization: Creates a static, final Logger instance associated
    // with this class.
    // It is used as a secure, structured alternative to System.out.println().
    private static final Logger LOGGER = Logger.getLogger(AnonymousClass.class.getName());

    public static void main(String[] args) {

        /*
         * Method Chaining with an Anonymous Inner Class:
         * 1. 'new Role() { ... }' declares an unnamed subclass and instantiates it
         * simultaneously.
         * 2. The '@Override' block provides the mandatory body for the 'postion()'
         * method.
         * 3. The trailing '.postion();' immediately executes the method on that newly
         * created object.
         * Note: Because the object is not assigned to a variable, it is discarded right
         * after execution.
         */
        new Role() {
            @Override
            void postion() {
                // Logs an informational message to the console with timestamp and class
                // metadata.
                LOGGER.info("I am a presales trainee ");
            }
        }.postion(); // Direct execution call

    }
}
