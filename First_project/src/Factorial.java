import java.util.Scanner;

//Factorial of  A GIVEN NUMBER Using Recurstion
public class Factorial {
	public static int Fact(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else
		{
			return n*Fact(n-1);
		}
	}
	

	public static void main(String[] args) 
	{
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = input.nextInt();
		
		System.out.println("factorial of a given number =  "+Fact(number));
		
		input.close();
		

	}

}
