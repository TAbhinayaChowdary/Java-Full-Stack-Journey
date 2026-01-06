public class OverloadCalculate {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method: different number of parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method: different data types of parameters
    public double add(double a, double b) {
        return a + b;
    }
    
    // You can also overload other operations like multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // The main method to run the calculator
    public static void main(String[] args) {
        OverloadCalculate calc = new  OverloadCalculate();

        // The compiler determines which 'add' method to call based on the arguments
        System.out.println("Sum of two integers (5, 10): " + calc.add(5, 10)); // Calls add(int, int)
        System.out.println("Sum of three integers (5, 10, 15): " + calc.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println("Sum of two doubles (5.5, 2.3): " + calc.add(5.5, 2.3)); // Calls add(double, double)
        
        System.out.println("Product of two integers (2, 3): " + calc.multiply(2, 3));
    }
}
