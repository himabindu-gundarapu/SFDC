package Java1stExam;

import java.util.Scanner;

public class Factorial_nonrecursive {
	public static int factorial( int number) {
		int fact =1;
		while( number>0)
		{
			fact = fact*number;
			number--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println(" enter any number :");
		int num = Input.nextInt();
		int fact = factorial(num);
		System.out.println(" factial value of given number is : " + fact);
		Input.close();
	}

}
