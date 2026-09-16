// Encapsulation + Access Control + Constructor + Static Factory Method
//
// Encapsulation = bundling data and methods together
// while controlling direct access to the data.

class Work {

    // Private variables
    // Direct access from outside the class is not allowed.
    private String name;
    private String department;

    // Private constructor
    // This constructor cannot be called directly from another class.
    private Work(String name, String department) {

        // 'this' refers to the current object.
        this.name = name;
        this.department = department;
    }

    // Getter method for name
    // Used to read the private 'name' variable.
    public String getName() {
        return name;
    }

    // Setter method for name
    // Used to modify the private 'name' variable.
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for department
    // Used to read the private 'department' variable.
    public String getDepartment() {
        return department;
    }

    // Setter method for department
    // Used to modify the private 'department' variable.
    public void setDepartment(String department) {
        this.department = department;
    }

    // Static Factory Method
    // This public method provides a way to create a Work object
    // even though the constructor is private.
    public static Work createObWork(String name, String department) {

        // Calls the private constructor and returns a new Work object.
        return new Work(name, department);
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        // We cannot directly call the private constructor:
        // Work w = new Work("Dev", "Presales"); // ❌ Not allowed

        // Instead, we use the public static factory method.
        Work w = Work.createObWork("Dev", "Presales");

        // Reading private variables using getter methods.
        System.out.println(
                "The name of the person is = " + w.getName()
                        + ", and the department is = " + w.getDepartment());

        // Modifying private variables using setter methods.
        w.setName("Ram");
        w.setDepartment("IT");

        // Reading the updated values using getter methods.
        System.out.println();

        System.out.println(
                "The name of the person is = " + w.getName()
                        + ", and the department is = " + w.getDepartment());
    }
}