package Java1stExam;

import java.util.Scanner;

public class FirstnonRepeatingChar {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any String ");
		String str = Input.nextLine();
		int result = -1;


		for (int i = 0; i < str.length(); i++) {
			boolean repeating = false;
			for(int j =0;j < str.length();j++) {
					if ( (i != j) && (str.charAt(i) == str.charAt(j))) {
						repeating = true;
						break;
					}
			}
			
			if (repeating == false) { result = i; break; }
		}
		
		if (result == -1) {
			System.out.println("No non repeating character found");
			
		} else {
			System.out.println("First non repeating character found at "+ result);
		}
		
		Input.close();

	
}
}