// Definition of the Abstract Class
// It cannot be instantiated directly and serves as a blueprint.
abstract class School {

    // Abstract Method: Declared here with no body.
    // Every concrete (non-abstract) subclass MUST override and implement this.
    abstract void classes();

    // Concrete/Regular Method: Fully implemented here.
    // Subclasses inherit this functionality automatically without needing to
    // redefine it.
    public void branch() {
        System.out.println("The branch of the Student is from PCM");
    }
}

// Concrete Subclass: Inherits from the abstract School class using the
// 'extends' keyword.
public class Abstraction extends School {

    // The @Override annotation informs the compiler that this method
    // is providing the mandatory implementation for the abstract method in the
    // parent class.
    @Override
    void classes() {
        System.out.println("the class is 12 th ");
    }

    // The entry point of the program.
    // It runs in a static context, independent of any specific object instance.
    public static void main(String[] args) {

        /*
         * Polymorphism in action:
         * A reference variable of parent type 'School' is used to hold
         * an instance object of child type 'Abstraction' on the heap memory.
         */
        School obj = new Abstraction();

        // Calls the inherited concrete method from the School class.
        obj.branch();

        // Calls the overridden method implemented inside the Abstraction class.
        obj.classes();
    }
}
