import java.util.Scanner;
public class Caluclator {
	static double Add(double a, double b)
	{
		return  (a+b);
	}
	static double Substraction(double a , double b)
	{
		return a-b;
	}
	static double Division(double a, double b) {
		return (a/b);
	}
	static double Moduluse(double a, double b) {
		return a%b;
	}
	static double Multiplication(double a, double b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter numbers  to operate:");
		double number1 = input.nextDouble();
		
		System.out.println("Enter an operand,\n '+' for addition,\n '-'  for substraction \n '*' for multiplication,  \n '/' for division,\n '%' for moduluse");
		//String select = input.next();
		char select = input.next().charAt(0);
		System.out.println("Enter another number to operate");
		double number2 = input.nextDouble();
		
	
		switch (select)
		{
		case '+': System.out.println(Add(number1,number2));
					break;
		case '-': System.out.println(Substraction(number1,number2));
					break;
		case '/': System.out.println(Division(number1,number2));
					break;
		case '%': System.out.println(Moduluse(number1,number2));
					break;	
		case '*': System.out.println(Multiplication(number1,number2));
					break;
		
		}
		
input.close();
	}

}
