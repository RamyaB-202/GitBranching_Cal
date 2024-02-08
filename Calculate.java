import java.util.Scanner;

public class Calculate {

    /**
     * The function "add" takes two double numbers as input and returns their sum.
     * 
     * @param num1 The first number to be added.
     * @param num2 The parameter "num2" is a double data type, which means it can hold decimal numbers.
     * @return The sum of num1 and num2.
     */
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * The function subtracts two numbers and returns the result.
     * 
     * @param num1 The first number to be subtracted.
     * @param num2 The second number to be subtracted from the first number.
     * @return The difference between num1 and num2 is being returned.
     */
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * The function "multiply" takes two double numbers as input and returns their product.
     * 
     * @param num1 The first number to be multiplied.
     * @param num2 The second number to be multiplied.
     * @return The product of num1 and num2 is being returned.
     */
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * The function divides two numbers and throws an exception if the second number is zero.
     * 
     * @param num1 The first number to be divided.
     * @param num2 The second number to be divided by.
     * @return The method is returning the result of dividing `num1` by `num2`.
     */
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
        sc.close();
    }

    
}