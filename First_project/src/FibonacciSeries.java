import java.util.Scanner;
public class FibonacciSeries {
	public static int[] Fibonacci (int n)
	{
		int a = 0;
		int b =1;
		int c =0;
		int array[] = new int[n];
	
	for(int i=0; i< n; i++)
	{
		//System.out.println(c);
		c = a+b;
		b = a;
		a = c;
		array[i]=c;
	}
		
	
	return  array;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter number :");
		int number = input.nextInt();
		int result[] = Fibonacci(number);
		
		for (int i=0; i<result.length; ++i) {
			System.out.println(result[i] + " ");
		}
		
		
		input.close();	
		}

}
