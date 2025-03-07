import java.util.Random;

public class MathProblems {
    public static int getRandomMathProblem() {
        Random rand = new Random();
        // Generate a random math problem with two numbers and an operator (+, -, x, /)
        char op = "+-*/".charAt(rand.nextInt(4));
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        int answer;
        switch (op) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
        }
        return answer;
    }
}
