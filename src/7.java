import java.util.Random;

public class MathProblem {
  private int x;
  private int y;
  private String operator;

  public MathProblem(int x, int y, String operator) {
    this.x = x;
    this.y = y;
    this.operator = operator;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public String getOperator() {
    return operator;
  }

  public int calculate() {
    if (operator.equals("+")) {
      return x + y;
    } else if (operator.equals("-")) {
      return x - y;
    } else if (operator.equals("*")) {
      return x * y;
    } else if (operator.equals("/")) {
      return x / y;
    } else {
      throw new IllegalArgumentException("Invalid operator: " + operator);
    }
  }
}
