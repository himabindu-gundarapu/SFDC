import java.util.Scanner;
public class PositiveOrNegative {
	public static void Is_positive(int n)
	{
		if (n >= 0)
		{
			System.out.println("Given number is Positive.");
			
		}
		else {
			System.out.println("Given number is Negative.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = input.nextInt();
		Is_positive(number);
		
		input.close();
	}

}
