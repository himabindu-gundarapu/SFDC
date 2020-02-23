import java.util.Scanner;

public class IsPolyndromeString {
	public static boolean Is_polyndrome(String str) {
		char[] ch = str.toCharArray();
		int len = ch.length;
		boolean b = false;
		for (int i = 0; i < len / 2; i++) {
			if (ch[i] == ch[len - 1]) {
				b = true;
				len = len - 1;
			} else {
				b = false;
			}
		}
		return b;
	}
	public static boolean Is_polyndrome(int num) {
		int reminder = 0;
		int revNum = 0;
		boolean b = false;
		int givenNum = num;
		while(num>0)
		{
			reminder = num%10 ;
			num = num/10;
			revNum = revNum *10 + reminder;
		}
		if( givenNum == revNum) {
			b = true;
			}
		else {
			b = false;
		}
		return b;
	}

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any string ");
		String str = Input.next();
		System.out.println(" enter any number ");
		int number = Input.nextInt();
		boolean b = Is_polyndrome(str);
		if (b == true) {
			System.out.println(" polyndrome String");
		} else {
			System.out.println(" not polyndrome");
		}
		
		boolean b1 = Is_polyndrome(number);
		if( b1 == true)
		{
			System.out.println(" polyndrome number");
			}
		else {
			System.out.println(" not polyndrome");
		}
		Input.close();
	}

}
