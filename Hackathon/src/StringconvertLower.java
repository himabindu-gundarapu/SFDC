import java.util.Scanner;

public class StringconvertLower {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any string :");
		String str = Input.nextLine();
		
		System.out.println("Lowercase String is : " +str.toLowerCase());
		Input.close();
		

	}

}
