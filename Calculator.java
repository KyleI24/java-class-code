// Name: Kyle Intendencia
// Program: Calculator.java
// Date: January 31, 2024
// Description: asks the user for 2 decimal number inputs then, it finds the sum, difference, product, quotient, and remainder and displays each calculation

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);// scanner to recieve the inputs for the first, and second decimal number from the user
        System.out.print("Enter the first decimal number: ");
        float number1 = scanner1.nextFloat();
        System.out.print("Enter the second decimal number: ");
        float number2 = scanner1.nextFloat();
        
        float sum = number1 + number2;// calculations to find the sum, difference, product, quotient, and remainder
        float difference = number1 - number2;
        float product = number1 * number2;
        float quotient = number1 / number2;
        float remainder = number1 % number2;

        System.out.println("Sum: " + sum);// prints all calculations
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("remainder: " + remainder);
        int x = 5, y = 28;
        float z;
        z = (float) (y / x); 
        System.out.println(z);
    }
}