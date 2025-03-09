public class MathProblems {

	public static int randomNumber(int max) {
		return (int)(Math.random() * max);
	}

	public static int sumOfTwoMultipliedNumbers(int a, int b) {
		return a * b + (a * b);
	}

	public static boolean isPrime(int n) {
		if (n <= 1) return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

	public static int findLargestFactor(int n) {
		for (int i = n; i > 1; i--) {
			if (n % i == 0) return i;
		}
		return 1;
	}

	public static int findSmallestFactor(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) return i;
		}
		return n;
	}

	public static boolean isPowerOfTwo(int x) {
		return (x > 0) && ((x & (x - 1)) == 0);
	}
}