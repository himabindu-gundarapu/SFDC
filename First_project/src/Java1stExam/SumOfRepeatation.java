package Java1stExam;

import java.util.Scanner;

public class SumOfRepeatation {
	public static int Sum_of_repetation(int num) {
		int sum = 0;
		int result = 0;
		int firstNumber = 0;
		for( int i = 1; i<num; i++) {
			result = firstNumber*10+num;
			sum = sum+result;
			firstNumber = result;
			}
		return sum;
	}

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter an Integer Number :");
		int number = Input.nextInt();
		int sum = Sum_of_repetation(number);
		System.out.println(sum);
		Input.close();

	}

}
