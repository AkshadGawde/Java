public class stringIntern {
    String s1 = "Hello";
    String s2 = new String("Hello");

    // Constructor
    public stringIntern() {
        // Using intern() method
        String s3 = s2.intern();

        // Comparing references
        System.out.println(s1 == s2); // Output: false
        System.out.println(s1 == s3); // Output: true
    }

    public static void main(String[] args) {
        // Creating an instance of StringIntern to invoke the constructor
        stringIntern si = new stringIntern();
    }
}
