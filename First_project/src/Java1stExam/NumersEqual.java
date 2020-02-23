package Java1stExam;

import java.util.Scanner;

public class NumersEqual {
	public static void is_equal(int num1,int num2,int num3,int num4) {
		if(num1 == num2)
		{
			if(num2==num3) {
				if(num3 == num4) {
					System.out.println("all four numbers are equal");
				}
			}
			
		}
		else {
			System.out.println("not equal");
		}
		
	}

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter four numbers :");
		int num1 = Input.nextInt();
		int num2 = Input.nextInt();
		int num3 = Input.nextInt();
		int num4 = Input.nextInt();
		is_equal(num1,num2,num3,num4);
		Input.close();

	}

}
