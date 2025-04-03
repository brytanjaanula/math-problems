public class MathProblemSolver {
    public static void main(String[] args) {
        // Example problem: Sum of first n natural numbers
        int n = 10;
        double sum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
    }
}
