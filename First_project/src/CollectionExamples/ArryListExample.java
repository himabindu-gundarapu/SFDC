package CollectionExamples;

import java.util.ArrayList;
import java.util.Scanner;

public class ArryListExample {

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("enter elements in to array :");
		for (int i = 0; i < 10; i++) {
			al.add(Input.nextInt());
		}
		System.out.println("enter number from array list :");
		System.out.println("Index of given number is :" + al.indexOf(Input.nextInt()));
		Input.close();
	}

}
