import java.util.HashSet;
import java.util.Scanner;

public class DuplicateOfString {
	public static HashSet<Character> Duplicate_char(String s)
	{
		char[] chArr = s.toCharArray();
		
		HashSet<Character> hs = new HashSet<>();
		HashSet<Character> hsResult = new HashSet<>();
		for( Character c : chArr) {
			if( hs.contains(c)) {
				hsResult.add(c);
			}
			else {
				hs.add(c);
			}
		}
		return hsResult;
	}
	public static void main(String[] args) {
		
			Scanner Input = new Scanner(System.in);
			System.out.println(" enter any string : ");
			String str = Input.nextLine();
			HashSet<Character> hs = new HashSet<>();
			System.out.println(" duplicate values in String :");
			hs = Duplicate_char(str);
			
			for(Character c : hs) {
				System.out.println(c);
			}
			Input.close();

	}

}
