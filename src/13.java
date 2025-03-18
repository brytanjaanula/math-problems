import java.util.Random;

public class MathProblem {
  private static final Random random = new Random();

  public static String getNextMathProblem() {
    // Generate a random number between 1 and 10
    int num1 = random.nextInt(10) + 1;
    int num2 = random.nextInt(10) + 1;

    // Choose an operation (addition, subtraction, multiplication, or division)
    char op = random.nextBoolean() ? '+' : '-';
    if (random.nextBoolean()) {
      op = '*';
    } else if (random.nextBoolean()) {
      op = '/';
    }

    // Build the problem string
    String problem = String.format("%d %c %d", num1, op, num2);

    return problem;
  }
}
