import org.javatuples.Pair;

public class MathProblems {

    public static void main(String[] args) {
        Pair<Double, Integer> result = solveQuadraticEquation(new double[]{1.0, -3.0});
        System.out.println("The solution to the quadratic equation is: " + result.getFirst() + " and " + result.getSecond());
    }

    private static Pair<Double, Integer> solveQuadraticEquation(double[] coefficients) {
        if (coefficients.length < 2) {
            throw new IllegalArgumentException("Coefficient array must have at least two elements.");
        }
        double a = coefficients[0];
        double b = coefficients[1];
        double c = coefficients[2];

        double discriminant = b * b - 4.0 * a * c;

        if (discriminant > 0) {
            // Two real solutions
            double sqrtDiscriminant = Math.sqrt(discriminant);
            double x1 = (-b + sqrtDiscriminant) / (2.0 * a);
            double x2 = (-b - sqrtDiscriminant) / (2.0 * a);

            return Pair.with(x1, x2);
        } else if (discriminant == 0) {
            // One real solution
            double x = -b / (2.0 * a);
            return Pair.with(x, x);
        } else {
            // No real solutions
            throw new IllegalArgumentException("Quadratic equation has complex roots.");
        }
    }
}
