import java.util.Scanner;

public class MathPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        int difference = num1 - num2;
        double product = num1 * num2;
        boolean greaterThan = num1 > num2;
        boolean lessThan = num1 < num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        System.out.println("Is " + num1 + " greater than " + num2 + "? " + greaterThan);
        System.out.println("Is " + num1 + " less than " + num2 + "? " + lessThan);
    }
}
