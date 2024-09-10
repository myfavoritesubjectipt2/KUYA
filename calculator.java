import java.util.Scanner;
 
public class Calculator {
    public class Calculator {
 
        public static int add(int a, int b) {
            return a + b;
        }
        
        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static double divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return (double) a / b;
        }

        public static int modulus(int a, int b) {
            return a % b;
        }
     
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
     
            System.out.println("Simple Calculator");
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
     
            // Read user choice
            int choice = scanner.nextInt();
     
            // Read user input numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
     
            // Perform the selected operation
            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    try {
                        System.out.println("Result: " + divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Result: " + modulus(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
                    break;
            }
     
            // Close the scanner
            scanner.close();
        }
    }