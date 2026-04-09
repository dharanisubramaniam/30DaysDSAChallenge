public class MainOverload {
    // The Real Entry Point (The Boss)
    public static void main(String[] args) {
        System.out.println("JVM started the String[] main!");
        main(100); // Manually calling the overloaded version
    }

    // Overloaded Version 1
    public static void main(int x) {
        System.out.println("Overloaded main with int: " + x);
    }

    // Overloaded Version 2
    public static void main(String arg1, String arg2) {
        System.out.println("Overloaded main with two Strings!");
    }
}