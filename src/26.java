import java.util.Scanner;

public class MathProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        double product = num1 * num2;
        double difference = num1 - num2;
        double quotient = num1 / num2;

        if (num1 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
            System.out.println("Product of " + num1 + " and " + num2 + " is " + product);
            System.out.println("Difference between " + num1 + " and " + num2 + " is " + difference);
            System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotient);
        }
        
        scanner.close();
    }
}
