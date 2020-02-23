import java.util.Scanner;
public class SumOfArray_numbers {
	// Function to caluclate sum of elements in the array
	public static int SumOfElements(int[] a)
	{
		int sum = 0;
		for ( int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int[] array = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("enter elements into an array:");
		for(int i = 0; i<array.length; i++)
		{
			array[i] = input.nextInt();
		}
		 System.out.println("sum of the array elemts is :" +SumOfElements(array));
		
		 input.close();
	}

}
