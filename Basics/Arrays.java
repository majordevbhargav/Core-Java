public class Arrays {
    public static void main(String args[]) {
        // primitive data types
        // The primitive array stores integer values and is traversed using a loop.
        // intialising as array literal
        /*
         * int arr[]=new int[5];
         * arr = new int[] { 1, 2, 3, 4, 5 };
         * int[] arr = {1, 2, 3, 4, 5 };
         * System.out.println(arr[3]+"");
         * System.out.println(arr[0]);
         * arr[4]=50;
         * 
         * //1. Access Array Elements
         * 
         * for (int i = 0; i < arr.length; i++) {
         * System.out.println(arr[i]);
         * }
         * // non-primitive data types array (String)
         * String[] names = { "Dev", "Rahul", "Mukesh" };
         * for (int i = 0; i < names.length; i++) {
         * System.out.println(names[i]);
         * }
         */
        class Student {
            int roll_no;
            String name;

            Student(int roll_no, String name) {
                this.roll_no = roll_no;
                this.name = name;
            }

            void Pass(int arr1[]) {
                for (int i = 0; i < arr1.length; i++) {
                    System.out.println(arr1[i]);
                }
            }

            public static int[] m1() {
                int arr2[] = { 10, 20, 30, 40, 50 };
                return arr2;
            }
        }

        Student S = new Student(0, null);
        // passing the array to a method
        int[] arr1 = { 1, 2, 3, 4, 5 };
        S.Pass(arr1);

        int arr2[] = Student.m1();

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // declares an Array of Student
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];
        // initialize the elements of the array
        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "vaibhav");
        arr[2] = new Student(3, "shikar");
        arr[3] = new Student(4, "dharmesh");
        arr[4] = new Student(5, "mohit");
        try {
            for (int i = 0; i < arr.length + 1; i++) {
                System.out.println("Element at " + i + " : { "
                        + arr[i].roll_no + " "
                        + arr[i].name + " }");

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }
    }
}
