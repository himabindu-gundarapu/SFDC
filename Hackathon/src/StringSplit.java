import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		System.out.println(" Enter any String : ");
		String str = Input.nextLine();
		String[] str2 = str.split(" ");
		for( String s : str2) {
		System.out.println(s);
		}
		Input.close();
		
		

	}

}
