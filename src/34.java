import java.util.Scanner;

public class MathProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Example calculation: 2 + 2
        int sum1 = scanner.nextInt();
        System.out.println("Sum of 2 and 2 is " + (sum1));
        
        // Example calculation: x^3 - y^3
        double xCube = scanner.nextDouble();
        double yCube = scanner.nextDouble();
        double result = Math.pow(xCube, 3) - Math.pow(yCube, 3);
        System.out.println("Result of x^3 minus y^3 is " + result);
        
        // Example calculation: Factorize the number 18
        int factorizedNumber = scanner.nextInt();
        System.out.println("Factorization of " + factorizedNumber + " is " + (factorize(factorizedNumber)));
    }
    
    public static double factorize(int n) {
        if (n == 0) return 0;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                n /= i;
            }
        }
        
        if (n > 1) return n;
        else return 1;
    }
}
