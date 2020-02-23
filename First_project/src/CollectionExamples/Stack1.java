package CollectionExamples;

import java.util.Scanner;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int size = sc.nextInt();
		int [] array1 = new int[size];
		System.out.println(array.length);
		for(int i=0;i<3;i++) {
			array1[i]= sc.nextInt();
		}
		System.out.println(array1.length);
		sc.close();
	}
	

}
