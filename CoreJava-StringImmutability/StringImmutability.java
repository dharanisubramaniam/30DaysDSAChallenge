public class StringIdentity {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1; // s2 points to the same "Java" in the pool

        System.out.println(s1 == s2); // Prints TRUE

        // Attempting to "modify" s1
        s1 = s1 + " Programming";

        System.out.println(s1); // Prints "Java Programming"
        System.out.println(s2); // Prints "Java" (s2 is unchanged!)
        System.out.println(s1 == s2); // Prints FALSE
    }
}