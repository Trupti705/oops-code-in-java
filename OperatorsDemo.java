public class OperatorsDemo {

    // Method to perform addition
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }

    // Method to perform multiplication
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        // Arithmetic Promotion
        byte a = 20, b = 40;
        int result = a + b;

        System.out.println("Arithmetic Promotion Result: " + result);

        // Arithmetic Operators
        int x = 30, y = 15;

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        // Creating an object
        OperatorsDemo obj = new OperatorsDemo();

        // Calling the addition method
        obj.add(10, 15);

        // Calling the multiplication method
        int product = obj.multiply(6, 10);
        System.out.println("Multiplication: " + product);
    }
}