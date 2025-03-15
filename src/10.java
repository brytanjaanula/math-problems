import java.util.*;

public class MathProblems {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        int sum = num1 + num2;
        System.out.println("What is " + num1 + " + " + num2 + "?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals(String.valueOf(sum))) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect, the answer is " + sum);
        }
    }
}
