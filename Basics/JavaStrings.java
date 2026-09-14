// String in java is an object that is use to store a Sequence of characters 
public class JavaStrings {
    public static void main(String args[]) {

        /*
         * literal method . static memory
         * inside main so no problem directly callling them
         * String name="Dev";
         * String num="12345";
         * To make Java more memory efficient (because no new objects are created if it
         * exists already in the string constant pool). Java stores string literals in
         * the String Pool. If the same literal already exists in the pool, Java can
         * reuse the existing String object.
         * String str="Geeks For Geeks"
         * 2. Using new keyword (Heap Memory)
         * Using the new keyword creates a new object in heap memory, even if the same
         * string already exists in the pool.
         * Interfaces and Classes in Strings in Java
         * CharSequence Interface
         * length(),charAt,subSequence(),toString, String , String Buffer
         * // this will add the string to string constant pool.
         * String internedString = demoString.intern();
         * 
         * 
         * 
         * class Geeks
         * {
         * public static void main(String args[])
         * {
         * 
         * // Declaring Strings using String literals
         * String s1 = "TAT";
         * String s2 = "TAT";
         * 
         * // Declaring Strings using new keyword
         * String s3 = new String("TAT");
         * String s4 = new String("TAT");
         * 
         * // Printing all the Strings
         * System.out.println(s1);
         * System.out.println(s2);
         * System.out.println(s3);
         * System.out.println(s4);
         * }
         * }
         * 
         * 
         * Note: All objects in Java are stored in a heap. The reference variable is to
         * the object stored in the stack area or they can be contained in other objects
         * which puts them in the heap area also.
         */
        
        // Using new Keyword
        String name = new String("Dev");
        String str = "hello";
        String str1 = str.concat((" world"));
        System.out.println(str);
        System.out.println(str1);
        System.out.println(name);

    }
}
