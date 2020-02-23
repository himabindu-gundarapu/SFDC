import java.util.Scanner;

public class Find_integer {

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		System.out.println("enter any string");
		String str = Input.next();
		char[] cArr = str.toCharArray();
		int number_count = 0;
		int upper_count = 0;
		int lower_count = 0;
		for (int i = 0; i < cArr.length; i++) {
			if (Character.isDigit(cArr[i])) {
				number_count++;
			} else if (Character.isLowerCase(cArr[i])) {
				lower_count++;
			} else if (Character.isUpperCase(cArr[i])) {
				upper_count++;
			}
		}
		System.out.println(" no of digits are :" +number_count);
		System.out.println(" no of uppercase letters  are :" +upper_count);
		System.out.println(" no of lowercase letters are : " +lower_count);
		Input.close();
	}

}
