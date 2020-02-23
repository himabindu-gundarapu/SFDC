import java.util.Scanner;

public class STrngToUpper {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter  any String : ");
		String str = Input.nextLine();
		String str2 = str.toUpperCase();
		System.out.println("after converting to uppercase: " + str2);
		Input.close();

	}

}
