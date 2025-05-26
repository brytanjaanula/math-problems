public class MathProblems {
    public static void main(String[] args) {
        // Example problem 1: Solve the equation x^2 + y = z
        int x = 3;
        int y = 5;
        int z = x * x + y * y;

        if (z == 0) {
            System.out.println("The values of x and y do not satisfy the equation.");
        } else {
            // Example problem 2: Find the maximum value of a quadratic function ax^2 + bx + c
            int a = 1;
            int b = 3;
            int c = -4;

            double maxVal = (b * b) - (4 * a * c);
            double sqrtMax = Math.sqrt(maxVal);

            // Example problem 3: Calculate the surface area of a sphere given its radius
            double r = 5.0;
            double areaSqaure = 2 * Math.PI * r * r;

            System.out.println("The surface area of the sphere is " + areaSqaure);
        }
    }
}
