package Java1stExam;
//counting Spaces,Alphabet, Digits, other characters 
import java.util.Scanner;

public class CountingSpacesInGivnStr {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = Input.nextLine();
		int letter_count = 0;
		int space_count = 0;
		int digit_count = 0;
		int otherChar_count = 0;
		int length = str.length();
		//converting string to array
		char[] chArr = str.toCharArray();
		for (int i = 0; i < length; i++) {
			if (chArr[i] == ' ') {
				space_count = space_count + 1;
			} else if (Character.isAlphabetic(chArr[i])) {
				letter_count = letter_count + 1;
			}

			else if (Character.isDigit(chArr[i])) {
				digit_count = digit_count + 1;
			}

			else {
				otherChar_count = otherChar_count + 1;
			}

		}
		System.out.println("no of letters = " + letter_count);
		System.out.println("Number of spaces = " + space_count);
		System.out.println("Number of digits = " + digit_count);
		System.out.println("number of other chatactors = " + otherChar_count);

		Input.close();
	}

}
