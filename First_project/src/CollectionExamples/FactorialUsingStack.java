package CollectionExamples;
// Factorial of given number
import java.util.Scanner;
import java.util.Stack;

public class FactorialUsingStack {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("enter any numer :");
		int number = Input.nextInt();
	
		Stack<Integer> s1 = new Stack<>();
		 int  fact =1;
		 for(int i =1;i<=number; i++) {
			 s1.push(i);
		 }
		
		 while(s1.empty() == false) {
			 fact = fact*s1.pop();
		 }
		 System.out.println("factorial value of given number = " +fact);
		 Input.close();
		
	}

}
