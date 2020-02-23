import java.util.HashMap;
import java.util.Scanner;

public class Repeatedintegers_q20 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println(" enter any String");
		String str = Input.nextLine();
		char[] array = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int value = 0;
			if (hm.get(array[i]) != null) 
			{
				if (Character.isUpperCase(array[i]))
				{
					value = hm.get(array[i]);
					hm.put(array[i], value + 1);
					} 
					else {
						if (Character.isLowerCase(array[i])) {
						value = hm.get(array[i]);
						hm.put(array[i], value + 1);
						} 	
						else {
						if (Character.isDigit(array[i])) {
							value = hm.get(array[i]);
							hm.put(array[i], value + 1);
						}
						}
				}
			}
			else {
				hm.put(array[i], value + 1);
			}
			
		}
		int value = 0;
		for (Character c: hm.keySet()) {
			value = hm.get(c);
			System.out.println(c+ " occures" + value + "times");
			}
		Input.close();
	}

}
