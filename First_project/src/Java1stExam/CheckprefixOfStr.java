package Java1stExam;

import java.util.Scanner;

public class CheckprefixOfStr {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str = Input.nextLine();
		System.out.println("Enter string to check wether it starts with this sting : ");
		String str1 = Input.nextLine();
		boolean b = str.startsWith(str1);
		 System.out.println(b);
		 Input.close();
	}

}
