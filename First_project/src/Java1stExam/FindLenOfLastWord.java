package Java1stExam;

import java.util.Scanner;

public class FindLenOfLastWord {
	public static int LastWordLen(String  str) {
		String [] sArr;
		sArr = str.split(" ");
		int len = sArr.length;
		String str2 = sArr[len-1];
		int result =str2.length();
		return result;
		
	}
	

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any String :");
		String str = Input.nextLine();
		int res = LastWordLen(str);
		System.out.println("Length of last word of a given String is : " +res);
		
		
		
		
		Input.close();
		

		

}
}

