package Java1stExam;

import java.util.Scanner;

public class ReverseString {
	public static String Reverse(String str) {
		int length = str.length();
		String str1 ="";
		for (int i = length-1;i>=0;i--) {
			 str1 = str1+str.charAt(i);
		}
		return str1;
	}
	
	public static void main (String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str = Input.nextLine();
		System.out.println(" Given string is : " + str);
		String str1 = Reverse(str);
		System.out.println("Reverse of Given String is : " +str1);
		
		

		Input.close();

	}

}
