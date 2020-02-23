package Java1stExam;

import java.util.Scanner;

public class GeaterThanAvg {
	public static int Sum(int [] array, int size) 
	{
		int sum =0;
		for(int i = 0; i<size; i++ ) {
			sum= sum+array[i];
		}
		return sum;
		
	}
	public static void Is_greaterThanNumber(int avg, int [] array,int size) {
		
		for(int i=0;i<size;i++)
		{
			if(array[i]>avg)
			{
				System.out.println(array[i]);
			}
		}
		
		
	}
	

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter array Size : ");
		int size = Input.nextInt();
		int[] iArrNum = new int[size];
		System.out.println("Enter elemets into an array : ");
		for(int i =0; i<size;i++) {
			iArrNum[i] = Input.nextInt();
		}
		int sum1= Sum(iArrNum,size);
		int length = iArrNum.length;
		int avg =0;
		avg = sum1/length;
		System.out.println("Avarage of given numbers is : " +avg);
		System.out.println(" greater than average of an array numbers are :");
		
		Is_greaterThanNumber(avg,iArrNum,size);
		
		Input.close();
		
		

	}

}
