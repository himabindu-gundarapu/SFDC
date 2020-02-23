import java.util.Scanner;

public class Febonacci_Recursion {
	public static int Fibonacci_recursion(int n) {

		if (n == 0) {
			return 0;
		}
		if ((n == 1) || (n == 2)) {
			return 1;
		} else {
			return Fibonacci_recursion(n - 2) + Fibonacci_recursion(n - 1);

		}

	}

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		System.out.println(" enter number");
		int number = Input.nextInt();
		while (number <=0) {

			System.out.println(Fibonacci_recursion(number));
			number++;
		}
		Input.close();
	}
}
