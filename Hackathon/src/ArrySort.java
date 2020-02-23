import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrySort {

	public static void main(String[] args) {
		ArrayList<Integer> Al = new ArrayList<>();
		Scanner Input = new Scanner(System.in);
		int size;
		System.out.println("enter Array size : ");
		size =Input.nextInt();
		System.out.println("Enter elments in to array : ");
		for(int i =0; i< size;i++) {
			Al.add(Input.nextInt());
		}
			Collections.sort(Al);
			System.out.println(Al);
			Input.close();
}
}