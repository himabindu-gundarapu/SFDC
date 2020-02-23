package Java1stExam;

import java.util.Scanner;

public class OddNumbersOfArray {

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		System.out.println("enter array size : ");
		int size = Input.nextInt();
		System.out.println("size = " + size);
		int[] iArrNum = new int[size];
		int temp = 0;
		System.out.println("Enter elements into Array :");
		for (int i = 0; i < size; i++) {
			iArrNum[i] = Input.nextInt();
		}
		int oddPosition = 0;
		int evenPosition = 0;
		int length = iArrNum.length;
		while ((oddPosition < length) && (evenPosition < length)) {
			while ((oddPosition < length) && ((iArrNum[oddPosition] % 2) == 0)) {
				oddPosition++;
			}
			evenPosition = oddPosition;
			while ((evenPosition < length) && (iArrNum[evenPosition] % 2 != 0)) {
				evenPosition++;
			}
			if (evenPosition < length) {
				temp = iArrNum[oddPosition];
				iArrNum[oddPosition] = iArrNum[evenPosition];
				iArrNum[evenPosition] = temp;

			}
			oddPosition++;

		}
		for (int i = 0; i < size; i++) {
			System.out.println(iArrNum[i]);
		}

		Input.close();

	}

}
