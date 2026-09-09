// Java program to demonstrate the use of variables, classes, and interfaces
interface Animals {
    void sound();
}

// Dog class implements the Animals interface and provides implementation for
// the sound method
class Dog implements Animals {
    // Method Overriding

    public void sound() {
        System.out.println("Dog barks");
    }
}

class Car {
    String model;
    int year;

    // a constructor is use to initialize car class which contain two fields model
    // and year
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Car model is: " + model);
        System.out.println("Car year is: " + year);
    }
}

class Variable {
    public static void main(String args[]) {
        int marks = 98;
        String Name = "john";
        float percentage = 98.5f;
        boolean isPass = true;
        byte age = 20;
        short height = 5;
        int[] numbers = { 1, 2, 3, 4, 5 };
        String[] fruits = { "apple", "banana", "cherry" };
        System.out.println("Numbers array: " + java.util.Arrays.toString(numbers));
        System.out.println("Fruits array: " + java.util.Arrays.toString(fruits));
        System.out.println("Length of numbers array: " + numbers.length);
        System.out.println("Length of fruits array: " + fruits.length);
        System.out.println("First element of numbers array: " + numbers[0]);
        System.out.println("First element of fruits array: " + fruits[0]);
        // myCar is an object of class car which is created and constructor is called to
        // initialize the fields
        Car myCar = new Car("Toyota", 2020);
        // Object of class car is created and constructor is called to initialize the
        // fields
        myCar.display();
        Dog myDog = new Dog();
        myDog.sound();
        System.out.println(marks);
        System.out.println(Name);
        System.out.println(percentage);
        System.out.println(isPass);
        System.out.println(age);
        System.out.println(height);
    }
}