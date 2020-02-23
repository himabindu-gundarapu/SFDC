import java.util.Scanner;

public class Reverse3numbersOfArray {
	public static int[]  rev_three_numbers(int[] iArr, int k) {
		int startpoint = 0;
		int endpoint =k-1;
		int[] resultArr = new int[iArr.length];
		int index =0;
		
			for( int i= startpoint;i<iArr.length/k;i++) {
			for( int j = endpoint; j>=startpoint;j--) {
				resultArr[index] = iArr[j];
				index++;
			}
			startpoint = endpoint+1;
			endpoint = endpoint+k;
			}
		return resultArr;
		
		
	}

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.println("enter array size : ");
		int size =Input.nextInt();
		int[] iArr = new int[size];
		System.out.println("enter elements into array :");
		for(int i =0;i<size;i++) {
			iArr[i] = Input.nextInt();
		}
		System.out.println(" enter number to reverse number series :");
		int k = Input.nextInt();
		int[] resultArr = rev_three_numbers(iArr,k);
		for( int i =0;i<size;i++) {
			System.out.println(resultArr[i]);
		}
		Input.close();
	}

}
