import java.util.*;
public class RandomMathProblem {
    public static void main(String[] args) {
        // Generate a random math problem
        Random rand = new Random();
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        char op = "+-*/".charAt(rand.nextInt(3));

        // Print the math problem
        System.out.println("What is " + num1 + " " + op + " " + num2 + "?");
    }
}
