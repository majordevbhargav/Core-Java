/*Types of Methods in Java
1. Predefined Method
Math.random()    // returns random value
Math.PI     //returns the value of π as a constant. it is a Constant not a Method
 
2. User-defined Method
sayHello         // user define method created above in the article
Greet() 
setName()
Different Ways to Create Java Method

// Instance Method
void method_name() {
    // instance method body
}

// Static Method
static void method_name() {
    // static method body
}

Method Signature
It consists of the method name and a parameter list.

Number of parameters
Type of the parameters
Order of the parameters

class Geeks {
    void hello() {
        System.out.println("This is a user-defined method.");
    }

    public static void main(String[] args) {
        Geeks obj = new Geeks(); // Create object
        obj.hello();             // Call method
    }
}

abstract class GeeksHelp {
    abstract void check(String name); // Abstract method
}

public class Geeks extends GeeksHelp {
    @Override
    void check(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Geeks obj = new Geeks(); // Subclass object
        obj.check("GeeksforGeeks");
    }
}

public class Geeks {
    public static void main(String[] args) {
        Geeks obj = new Geeks();
        System.out.println(obj.hashCode()); // Predefined method
    }
}

class Test {
    static void hello() {
        System.out.println("Hello");
    }
}
public class Geeks {
    public static void main(String[] args) {
        Test.hello(); // Call static method directly
    }
}
*/
class Method {
    /*
     * returnType methodName(parameters) {
     * // method body
     * return value; // optional (only if returnType is not void)
     * }
     */
    public void printMessage() {
        System.out.println("This is a method ");
    }

    static void hello() {
        System.out.println("Hello World ");

    }
}

public class CallStackExample {
    public static void D() {
        float d = 40.5f;
        System.out.println("In method D");
    }

    public static void C() {
        double c = 30.5d;
        System.out.println("In method C");
    }

    public static void B() {
        int b = 20;
        C();// calling C
        System.out.println("In Method B");
    }

    public static void A() {
        int a = 10;
        B();// calling B
        System.out.println("In method A");
    }

    public static void main(String args[]) {
        Method m = new Method();
        m.printMessage();
        A();// start function A
        D();// Then call D
        Method.hello();
    }
}
