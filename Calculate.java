//import java.util.Scanner;

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
    /**
     * The function "square" takes a number as input and returns the square of that number.
     * 
     * @param num3 The parameter "num3" is a double data type, which means it can hold decimal values.
     * @return The square of the input number.
     */
    public static double square(double num3){
        return num3 * num3;
    }
    /**
     * The function cube takes a number as input and returns the cube of that number.
     * 
     * @param num4 The parameter "num4" is a double data type, which means it can hold decimal values.
     * @return The cube of the input number.
     */
    public static double cube(double num4){
        return num4 * num4 * num4;
    }

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        double num1=26, num2=12, num3=46, num4=86;

        System.out.print("Enter the first number: "+num1);
        //num1 = sc.nextDouble();

        System.out.print("Enter the second number: "+num2);
        //num2 = sc.nextDouble();

        System.out.print("Enter the value to square: "+num3);
        //num3 = sc.nextDouble();

        System.out.print("Enter the value to cube: "+num4);
        //num4 = sc.nextDouble();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
        System.out.println("Square: " + square(num3));
        System.out.println("Cube: " + cube(num4));
        //sc.close();
    } 
}
