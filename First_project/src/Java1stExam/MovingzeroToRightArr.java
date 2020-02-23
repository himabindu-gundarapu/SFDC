package Java1stExam;

import java.util.Scanner;
// moving zeros from given array to end of the array
public class MovingzeroToRightArr {
	public static int [] MovingZero(int [] iArrNum, int size) {
		int[] tempArr = new int[size];
		int position = 0;
		for (int i = 0; i < size; i++) {
			if (iArrNum[i] != 0) {
				tempArr[position] = iArrNum[i];
				position++;
			}

		}
		return tempArr;
		
	}

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		System.out.println("Enter array size ;");
		int size = Input.nextInt();
		int[] iArrNum = new int[size];
		
		System.out.println(" enter numbers into arrray : ");
		for (int i = 0; i < size; i++) {
			iArrNum[i] = Input.nextInt();
		}
		System.out.println("After moving Zeros  the array is : ");
		
		int[] iResultArr = MovingZero(iArrNum,  size); 
		for (int i = 0; i < size; i++) {
			System.out.println(iResultArr[i]);
		}
		

		Input.close();
	}

}
