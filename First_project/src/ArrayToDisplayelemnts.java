import java.util.Scanner;
public class ArrayToDisplayelemnts {

	public static void main(String[] args) {
		int array[] = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter elemnts into an Array :");
		for(int i = 0; i < 10; i++)
		{
			array[i] = input.nextInt();
			
		}
		System.out.println("Elemnts of an Array :");
		for( int i = 0; i<10; i++)
		{
			System.out.println(array[i]);
		}
		
		input.close();

	}

}
