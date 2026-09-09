class child {
    void display() {
        System.out.println("This is a method of child class");
    }

    void Loop() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("This is a for loop");
        }
    }
}

class  Introduction {
    public static void main(String args[]) {
        int my_var=20;
        System.out.println(my_var);
        System.out.println("Hello World");
        child c = new child();
        c.display();
        c.Loop();
    }
}