public class MathProblems {
    public static void main(String[] args) {
        // Randomly select an integer between 1 and 100
        int randomInt = (int)(Math.random() * 100) + 1;
        
        if (randomInt % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
