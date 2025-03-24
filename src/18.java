import java.util.Scanner;

public class MathProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + ", let's solve some math problems!");
        
        // Example: Solve the following equation
        double a = 3.0;
        double b = 2.0;
        double c = -1.5;
        double d = (b * b) - (4 * a * c);
        if (d > 0) {
            System.out.println("The quadratic equation has two real roots.");
        } else if (d == 0) {
            System.out.println("The quadratic equation has one real root.");
        } else {
            System.out.println("The quadratic equation has complex roots.");
        }
        
        scanner.close();
    }
}
