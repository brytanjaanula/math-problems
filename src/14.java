import java.util.Random;

public class MathProblems {
  private static final Random RANDOM = new Random();

  public int getRandomNumber(int min, int max) {
    return RANDOM.nextInt((max - min) + 1) + min;
  }
}
