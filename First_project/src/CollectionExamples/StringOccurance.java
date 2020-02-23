package CollectionExamples;

import java.util.HashMap;
import java.util.Scanner;

public class StringOccurance {
	public static void main(String[] args)
	{
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any String :");
		String str = Input.nextLine();
		char[] chArr = str.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<>();
		for (char ch : chArr) {
			if( hm.containsKey(ch))
			{
				int x = hm.get(ch)+1;
				hm.put(ch, x);
				
			}
			else {
				hm.put(ch, 1);
			}
		}

				System.out.println(hm);
			
		
		Input.close();

}
}