/*all the JAVA OOPs concepts 
class -a blueprint or template for creating objects 
object -instance of the class
Ecapsulation- protect data from direct access
Abstraction-hides unnecessay deatils 
Polymorphism-allow the same method to bheave diffently 
inheritence-reuses code form existing class*/


class Dog {
    String name;
    String colour;

    // constructor of the class Dog
    // parameterized Constructor
    Dog(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    // copy constructor
    Dog(Dog other) {
        this.name = other.name;
        this.colour = other.colour;

    }

}

class Car{
    String brand;
    String model;
    String colour;

    // constructor of the class Car
    Car(String brand, String model, String colour) {
        this.brand = brand;
        this.colour = colour;
        this.model = model;
    }

}

// Default Constructor
class DefaultConstructor {
    int i = 10;

    DefaultConstructor() {
        this.i = i;
    }
}

// Practical Example of Encapsulation in java
/*
 * private variable
 * ↓
 * can't directly access from outside
 * ↓
 * getter / setter
 * ↓
 * controlled access
 * 
 * private constructor
 * ↓
 * can't directly create object from outside
 * ↓
 * public factory method
 * ↓
 * controlled object creation
 */
class PrivateConstructor {
    // Private variable
    private int value;

    // Private constructor private
    PrivateConstructor(int value) {
        this.value = value;
    }

    // Getter public int
    public int getValue() {
        return value;
    }

    // Setter public
    void setValue(int value) {
        this.value = value;
    }

    // Public method to create an object public static

    public static PrivateConstructor createObject(int value) {
        return new PrivateConstructor(value);
    }
}

public class Javaoop{

    public static void main(String[] args) {
        // static belongs to the class, while an instance variable belongs to an object.
        // for the dog class
        Dog dog[] = new Dog[3];

        dog[0] = new Dog("tommoy", "Black");
        dog[1] = new Dog("Bruno", "Brown");
        dog[2] = new Dog("Max", "White");
        // copy constructor
        Dog dog2 = new Dog(dog[0]);
        System.out.println();
        System.out.println("The orignal Object of the class Dog = " + dog[0].name);
        System.out.println();
        System.out.println("The object created by using the copy constructor of class Dog =" + dog2.name);
        System.out.println();
        // Exapmle of dog with Parameterized Constructor
        for (int i = 0; i < dog.length; i++) {
            System.out.println("Dog " + (i + 1));
            System.out.println("Name of the dog is " + dog[i].name);
            System.out.println("Colour: " + dog[i].colour);
            System.out.println();
        }

        // for the class Car
        Car car[] = new Car[3];
        car[0] = new Car("honda", "2019", "black");
        car[1] = new Car("maruti", "2016", "purpule");
        car[2] = new Car("toyota", "2026", "white");
        for (int i = 0; i < car.length; i++) {
            System.out.println("Car = " + (i + 1));
            System.out.println("Name of the Car is = " + car[i].brand);
            System.out.println("model = " + car[i].model);
            System.out.println("colour: " + car[i].colour);
            System.out.println();
        }

        // Deafult constructor
        DefaultConstructor D = new DefaultConstructor();
        System.out.println("value of i =" + D.i);

        // Private method

        PrivateConstructor p = PrivateConstructor.createObject(100);

        // Reading the private variable using getter

        System.out.println("Initial value:" + p.getValue());

        // Changing the private variable using setter

        p.setValue(200);

        // Reading it again using getter

        System.out.println("Updated value: " + p.getValue());

    }
}
