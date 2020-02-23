package StackExamole;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test stk1 = new Test(10);

			
			// test program for ImplementingStack
			int num = 1234;
			while (num != 0) {
				int n = num%10;
				stk1.push(n);
				num = num/10;
			}
			
			int rev = 0;
			int mul = 1;
			while (stk1.empty() == false) {
				rev += (stk1.peek() * mul);
				mul *= 10;
				stk1.pop();
			}
			
			System.out.println("Reversed number = " + rev);
		}

	}


