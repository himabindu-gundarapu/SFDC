import java.util.Scanner;

public class PolyndromeArray {
	public static boolean Is_polyndromeArray(int [] array) {
		int[] RevArr = new int[array.length];
		int j =0;
		for( int i = array.length-1;i>=0;i--) {
			RevArr[j] = array[i];
			j++;
		}
		boolean b = false;
		for( int i =0; i<array.length;i++) {
			if(RevArr[i]==array[i]) {
				b = true;
			}
			else { b= false;}
		}
		return b;
		
	}

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.println(" enter array size :");
		
		int size = Input.nextInt();
		int[] array = new int[size];
		System.out.println("enter elemnts int to array");
		for( int i =0; i<size; i++) {
			array[i] = Input.nextInt();
		}
		boolean b = Is_polyndromeArray(array);
		
		if( b== true) {
			System.out.println("polyndrome array");
		}
		else {
			System.out.println("not polyndrome");
		}
		
		
		
	Input.close();
	}
	

}
