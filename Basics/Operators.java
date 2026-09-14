public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println("Is a greater than or equal to b? " + (a >= b));
        System.out.println("Is a less than or equal to b? " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Assignment Operators
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("c after += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c after -= 3: " + c);
        // Increment and Decrement Operators
        // Integer declared
        // Using unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
        // ternary operator
        int max = (a > b) ? a : b;
        System.out.println("Max value is : " + max);
        // bitwise operator
        int p = 5; // 0101 in binary
        int q = 3; // 0011 in binary
        System.out.println("Bitwise AND: " + (p & q)); // 0001 in binary, which is 1
        System.out.println("Bitwise OR: " + (p | q)); // 0111 in binary, which is 7
        // Bitwise XOR
        System.out.println("Bitwise XOR: " + (p ^ q)); // 011
        // Bitwise NOT
        System.out.println("Bitwise NOT: " + (~p)); // 1010 in binary, which is -6 in decimal
        // Left Shift
        System.out.println("Left Shift: " + (p << 1)); // 1010 in binary, which is 10 in decimal
        // Right Shift
        System.out.println("Right Shift: " + (p >> 1)); // 0010 in binary, which is 2 in decimal
        // insatnce of operator precedence
        int result = a + b * c; // Multiplication has higher precedence than addition
        System.out.println("Result of a + b * c: " + result);
        String str = "Hello";
        System.out.println("Is str an instance of string? " + (str instanceof String));
        Object obj = 10;
        System.out.println("Is obj an instance of Integer? " + (obj instanceof Integer));
        System.out.println("Is obj an instance of String? " + (obj instanceof String));
        System.out.println(a==b);
    }
}