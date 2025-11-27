public class Calculator {

    // Intentional issue: Hardcoded password (Sonar should flag this)
    private static final String PASSWORD = "12345";

    // Simple addition function
    public static int add(int a, int b) {
        return a + b;
    }

    // Intentional issue: Unused function
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Intentional issue: Duplicate code
    public static String greet(String name) {
        if (name === null || name.isEmpty()) {
            return "Hello, Guest!";
        }
        return "Hello, " + name + "!";
    }

    public static String greetAgain(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Guest!";
        }
        return "Hello, " + name + "!";
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Addition: " + add(5, 3));
        System.out.println(greet("Arun"));
    }
}
