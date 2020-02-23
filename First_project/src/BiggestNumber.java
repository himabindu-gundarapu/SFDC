import java.util.Scanner;
public class BiggestNumber {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size:");
		int x = input.nextInt();
		int array[] = new int[x];
		System.out.println("Enter elements into Array:");
		for(int i = 0;i<x;i++) 
		{
			array[i] = input.nextInt();
		}
		int FirstBiggest = array[0];
		for(int j=0; j<x;  j++)
		{
			//System.out.println("list of array numbers :" +array[j]);
			if (array[j] > FirstBiggest)
			{
			   FirstBiggest = array[j];
			}
		}
		System.out.println("First biggest number is :" +FirstBiggest);
		int SecondBiggest = 0;
		for(int k=0; k<x; k++)
		{
			if((array[k]>SecondBiggest) && (array[k] != FirstBiggest))
			{
				SecondBiggest = array[k];
			}
		}
		System.out.println("SecondBiggest number is :" +SecondBiggest);
		int ThirdBiggest =0;
		for(int i =0; i<x; i++)
		{
			if((array[i]>ThirdBiggest) && (array[i]!= FirstBiggest) && (array[i] != SecondBiggest))
			{
				ThirdBiggest = array[i];
			}
		}
		System.out.println("ThirdBiggest number is :" + ThirdBiggest);
		input.close();

	}

}
