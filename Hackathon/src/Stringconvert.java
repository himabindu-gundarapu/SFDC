import java.util.Scanner;

public class Stringconvert {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any string :");
		String str = Input.next();
		
		System.out.println("Lowercase String is : " +str.toLowerCase());
		Input.close();
		

	}

}
