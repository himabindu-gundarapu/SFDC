package Java1stExam;

import java.util.Scanner;

public class ArrayOfUnique {
	public static void Array_of_uniqueNumbers(int[] iArrNum) {
		int Size = iArrNum.length;
		boolean[] visited = new boolean[Size];
		for (int index = 0; index < iArrNum.length; index++) {
			int count = 1;
			if (visited[index] == true) {
				continue;
			}

			for (int index1 = 0; index1 < iArrNum.length; index1++) {
				if ((index != index1) && (iArrNum[index] == iArrNum[index1])) {
					count++;
					visited[index1] = true;
				}
			}

			System.out.println(iArrNum[index] + " occurs " + count + " times");
		}

		System.out.println("Unique numbers are : ");
		for (int index = 0; index < iArrNum.length; ++index) {
			if (visited[index] == true) {
				continue;
			}

			System.out.println(iArrNum[index]);
		}

	}

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("enter array size");
		int size = Input.nextInt();
		int[] iArrNum = new int[size];
		System.out.println("enter array elemnts:");
		for (int i = 0; i < iArrNum.length; i++) {
			iArrNum[i] = Input.nextInt();
		}
		Array_of_uniqueNumbers(iArrNum);
		Input.close();
	}

}
