import java.util.Random;

public class RandomMathProblem {
  public static void main(String[] args) {
    int x = new Random().nextInt(10);
    int y = new Random().nextInt(10);
    System.out.println("What is " + x + " times " + y + "?");
  }
}