import java.util.Scanner;

public class IntegerPolyndrome {
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
		System.out.println(" Enter any number ");
		int number = Input.nextInt();
		boolean b = Is_polyndrome(number);
		if( b == true)
		{
			System.out.println(" polyndrome number");
			}
		else {
			System.out.println(" not polyndrome");
		}
		Input.close();
}

}
