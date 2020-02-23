import java.util.Scanner;

public class FibonacciREcursion {
	public static int [] Fibonacci_series(int num) {
		int a = 0;
		int b = 1;
		int c = 0;
	
		int [] iArr = new int[num];
		int i = 0;
		while(num > 0) {
			c=a+b;
			
			iArr[i] = c;
			a=b;
			b=c;
			}
		return iArr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any number :");
		int number =Input.nextInt();
		int [] iArr = Fibonacci_series(number);
		

	}

}
