
import java.util.Scanner;
import java.util.TreeSet;

public class AScendingorder {
	public static TreeSet<Integer> Ascending_order(int[] array) {
		TreeSet<Integer> ts = new TreeSet<>();

		for (int i = 0; i < array.length; i++) {
			ts.add(array[i]);
		}

		return ts;

	}

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		Scanner Input = new Scanner(System.in);
		System.out.println(" enter Size :");
		int size = Input.nextInt();
		int[] iArr = new int[size];
		System.out.println(" enter elements into array : ");
		for (int i = 0; i < size; i++) {
			iArr[i] = Input.nextInt();
		}
		ts = Ascending_order(iArr);
		System.out.println(ts);
		Input.close();

	}

}
