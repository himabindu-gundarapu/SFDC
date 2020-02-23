package Java1stExam;
import java.util.Scanner;
// printing Ascii value of given charactor
public class Ascii {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any charactor:");
		char ch = Input.next().charAt(0);
		int ascii = (int) ch;
		System.out.println("The Ascii value of  " + ch + " is " + ascii);
		Input.close();

	}

}
