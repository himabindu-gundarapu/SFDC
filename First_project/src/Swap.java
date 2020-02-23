import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.println(" Before swap x& y values: "+x +"," +y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println(" After swap x& y values: "+x +"," +y);
		
		
		
		input.close();	

	}

}
